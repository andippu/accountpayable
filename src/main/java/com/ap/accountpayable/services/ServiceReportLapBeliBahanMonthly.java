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

import com.ap.accountpayable.Repository.IReportApInfo;
import com.ap.accountpayable.Repository.IReportBeliBahanMonthly;
import com.ap.accountpayable.Repository.IReportBeliBahanMonthlyBiaya;
import com.ap.accountpayable.Repository.IReportBeliBahanMonthlyOthers;
import com.ap.accountpayable.models.ReportApInfo;
import com.ap.accountpayable.models.ReportBeliBahanMonthly;
import com.ap.accountpayable.models.ReportBeliBahanMonthlyBiaya;
import com.ap.accountpayable.models.ReportBeliBahanMonthlyOthers;

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
	
	public JasperPrint generateReport(String nopo) throws Exception {
        // Load main report
        File file = ResourceUtils.getFile("classpath:LAP_AP_INFO_BAYAR.jasper");
        JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file);

        // Parameters for main report
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("p_nopo", "00057/V/19/UM/LAPI");

        // Load sub-report
        File subReportFile = ResourceUtils.getFile("classpath:Blank_A4_1.jasper");
        JasperReport subReport = (JasperReport) JRLoader.loadObject(subReportFile);

        // Add sub-report as a parameter
        parameters.put("ProductsSubReport", subReport);

        // Fill the report
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

        return jasperPrint;
    }


}

