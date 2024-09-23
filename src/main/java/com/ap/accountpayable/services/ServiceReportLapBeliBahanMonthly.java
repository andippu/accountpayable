package com.ap.accountpayable.services;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

import com.ap.accountpayable.Repository.IReportApInfo;
import com.ap.accountpayable.Repository.IReportBeliBahanMonthly;
import com.ap.accountpayable.Repository.IReportBeliBahanMonthlyBiaya;
import com.ap.accountpayable.Repository.IReportBeliBahanMonthlyOthers;
import com.ap.accountpayable.Repository.IReportBeliBelumLunas;
import com.ap.accountpayable.Repository.IReportCoaBeliLain;
import com.ap.accountpayable.Repository.IReportHutangDagangIdrRepository;
import com.ap.accountpayable.Repository.IReportHutangdagangValasRepository;
import com.ap.accountpayable.Repository.IReportOutstandingHutang;
import com.ap.accountpayable.Repository.IReportTandaTerimaFPajak;
import com.ap.accountpayable.Repository.IReportUnpaidAP;
import com.ap.accountpayable.models.ReportApInfo;
import com.ap.accountpayable.models.ReportBeliBahanMonthly;
import com.ap.accountpayable.models.ReportBeliBahanMonthlyBiaya;
import com.ap.accountpayable.models.ReportBeliBahanMonthlyOthers;
import com.ap.accountpayable.models.ReportBeliBelumLunas;
import com.ap.accountpayable.models.ReportCoaBeliLain;
import com.ap.accountpayable.models.ReportOutstandingHutang;
import com.ap.accountpayable.models.ReportTandaTerimaFPajak;
import com.ap.accountpayable.models.ReportUnpaidAP;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint; 
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

@Service
public class ServiceReportLapBeliBahanMonthly {
	@Autowired
	IReportBeliBahanMonthly repoRLBM;
	@Autowired
	IReportBeliBahanMonthlyBiaya repoRLBMB;
	@Autowired
	IReportBeliBahanMonthlyOthers repoRLBMO;
	@Autowired
	IReportApInfo repoApInfo;
	@Autowired
	IReportOutstandingHutang repoOutHut;
	@Autowired
	IReportTandaTerimaFPajak repoFTTFP;
	@Autowired
	IReportUnpaidAP repoUPAP;
	@Autowired
	IReportBeliBelumLunas repoBlBlLns;
	@Autowired
	IReportCoaBeliLain repoCBLLN;
	@Autowired
	IReportHutangDagangIdrRepository repoHDGI;
	@Autowired
	IReportHutangdagangValasRepository repoHDGV;
	
	
	public void tJaLapBeliBahanMonthly(String period, HttpServletResponse response) throws JRException, IOException {
		List<ReportBeliBahanMonthly> RLBM= repoRLBM.findByRlbmPeriodMonthOrderByRlbmTtbDate(period);		
		File file = ResourceUtils.getFile("classpath:LAP_BELIBHAN_MONTHLY.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RLBM);		
		Map<String, Object> parameters = new HashMap<>();		
		parameters.put("period", period);		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void tJaLapBeliBahanMonthlyBiaya(String period, HttpServletResponse response) throws JRException, IOException {
		List<ReportBeliBahanMonthlyBiaya> RLBMB= repoRLBMB.findByRlbmPeriodMonthOrderByRlbmTtbDate(period);		
		File file = ResourceUtils.getFile("classpath:LAP_BELIBAHAN_MONTHLY_LAIN.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RLBMB);		
		Map<String, Object> parameters = new HashMap<>();		
		parameters.put("period", period);		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void tJaLapBeliBahanMonthlyOther(String period, HttpServletResponse response) throws JRException, IOException {
		List<ReportBeliBahanMonthlyOthers> RLBMO= repoRLBMO.findByRlbmPeriodMonthOrderByRlbmTtbDate(period);		
		File file = ResourceUtils.getFile("classpath:LAP_BELIBAHAN_MONTHLY_LAIN.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RLBMO);		
		Map<String, Object> parameters = new HashMap<>();		
		parameters.put("period", period);		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void tJaLapAPInfo(String nopo, HttpServletResponse response) throws JRException, IOException {
		List<ReportApInfo> ApInfo= repoApInfo.findByRlaimNoPo(nopo);
		File file = ResourceUtils.getFile("classpath:LAP_AP_INFO.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(ApInfo);		
		Map<String, Object> parameters = new HashMap<>();			
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	
	public void tJaLapOutstandingHutang(String splcode, String pdate1, String pdate2, HttpServletResponse response) throws JRException, IOException {
		List<ReportOutstandingHutang> outhut= repoOutHut.findByRoshSplCodeAndRoshTtbDateBetween(splcode, pdate1, pdate2); //repoApInfo.findByRlaimNoPo(nopo);
		File file = ResourceUtils.getFile("classpath:LAP_OUTSTANDING_HUTANG.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(outhut);		
		Map<String, Object> parameters = new HashMap<>();		
		parameters.put("pdate1", pdate1);		
		parameters.put("pdate2", pdate2);		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void tJaLapTandaTerimaFPajak(String period, HttpServletResponse response) throws JRException, IOException {
		List<ReportTandaTerimaFPajak> outhut= repoFTTFP.findByRttfpPeriod(period);
		File file = ResourceUtils.getFile("classpath:LAP_TANDATERIMA_FPAJAK.jrxml");		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(outhut);		
		Map<String, Object> parameters = new HashMap<>();			
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public void tJaLapUnpaidAP(String pdate, String ptype, HttpServletResponse response) throws JRException, IOException {
		String temp=repoUPAP.execUnpaidAp(pdate, ptype);
		List<ReportUnpaidAP> outUPAP= repoUPAP.findAll();
		File file = ResourceUtils.getFile("classpath:LAP_UNPAID_AP.jrxml");	
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());	
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(outUPAP);	
		Map<String, Object> parameters = new HashMap<>();		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}
	
	public List<ReportBeliBelumLunas> tJaLapBeliBelumLunas(String pdate, String pdate2, byte choice) throws JRException, IOException {
		if (choice==1) {
			String temp=repoBlBlLns.execBlBlLnAntara(pdate, pdate2);
			return repoBlBlLns.findAll();
			}
		else {
			if (choice==2) {
				String temp=repoBlBlLns.execBlBlLnByInput(pdate, pdate2);
				return repoBlBlLns.findAll();
				}
			else {
				String temp=repoBlBlLns.execBlBlLnKecilSama(pdate, pdate2);
				return repoBlBlLns.findAll();
			}
		}	
	}
		
	public List<ReportCoaBeliLain> tJaLapCoaBeliLain(String pdate) throws JRException, IOException {	
			String temp=repoCBLLN.execCoaBeliLain(pdate);
			return repoCBLLN.findAll();
		
	}
	
	
	public List<ReportOutstandingHutang> tJaLapOutstandingHutang2(String splcode, String pdate1, String pdate2) {
		return repoOutHut.findByRoshSplCodeAndRoshTtbDateBetween(splcode, pdate1, pdate2); 
	}
	

	
	public JasperPrint generateReport(String nopo) throws Exception {
        // Load main report
        File file = ResourceUtils.getFile("classpath:LAP_AP_INFO_BAYAR.jasper");
        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);
        // Parameters for main report
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_nopo", nopo);
        // Load sub-report
        File subReportFile = ResourceUtils.getFile("classpath:Blank_A4_1.jasper");
        JasperReport subReport = (JasperReport) JRLoader.loadObject(subReportFile);
        // Add sub-report as a parameter
        parameters.put("ProductsSubReport", subReport);
        // Fill the report
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

        return jasperPrint;
    }
	
	
	public String getHutangDagangIdrExcel(String bulan, String title) {
		repoHDGI.runHitKartu(bulan);
		return repoHDGI.getExcel(bulan, title);
	}
	
	public String getHutangLainIdrExcel(String bulan, String title) {
		repoHDGI.runHitKartuLain(bulan);
		return repoHDGI.getExcel(bulan, title);
	}
	
	public String getHutangBiayaIdrExcel(String bulan, String title) {
		repoHDGI.runHitKartuBiaya(bulan);
		return repoHDGI.getExcel(bulan, title);
	}
	
	public String getLapHutangDagangIdr(String bulan, String title) {
		return repoHDGI.getLapHutangIdr(bulan, title);
	}
	
	public String runCloseHutangUmumIdr(String pnys) {
		return repoHDGI.runCloseHutangUmumIdr(pnys);
	}
	
	public String runCloseHutangLainIdr(String pnys) {
		return repoHDGI.runCloseHutangLainIdr(pnys);
	}
	
	public String runCloseHutangBiayaIdr(String pnys) {
		return repoHDGI.runCloseHutangBiayaIdr(pnys);
	}
	
	public String getPostHutangUmuIdr(String bulan) {
		return repoHDGI.runPostHutangUmuIdr(bulan);
	}
	
	public String getPostHutangLainIdr(String bulan) {
		return repoHDGI.runPostHutangLainIdr(bulan);
	}
	
	public String getPostHutangBiayaIdr(String bulan) {
		return repoHDGI.runPostHutangBiayaIdr(bulan);
	}
	
	
	public String getHutangDagangValasExcel(String bulan, String title) {	
		repoHDGV.runHitKartuValas(bulan);		
		return repoHDGV.getExcelValas(bulan, title);
	}
	
	public String getHutangLainValasExcel(String bulan, String title) {	
		repoHDGV.runCloseHutangLainValas(title);
		return repoHDGV.getExcelValas(bulan, title);
	}
	
	
	public String runCloseHutangValas(String pnys) {
		return repoHDGV.runCloseHutangLainValas(pnys);
	}
	
	public String runCloseHutangLainValas(String pnys) {
		return repoHDGV.runCloseHutangLainValas(pnys);
	}


}

