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

import com.ap.accountpayable.Repository.IReportBeliBahanMonthly;
import com.ap.accountpayable.models.ReportBeliBahanMonthly;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint; 
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ServiceReportLapBeliBahanMonthly {
	@Autowired
	IReportBeliBahanMonthly repoRLBM;
	
	public void tJaLapBeliBahanMonthly(String period, HttpServletResponse response) throws JRException, IOException {

		List<ReportBeliBahanMonthly> RLBM= repoRLBM.findByRlbmPeriodMonthOrderByRlbmTtbDate(period);
		
		File file = ResourceUtils.getFile("classpath:LAP_BELIBHAN_MONTHLY.jrxml");
		
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(RLBM);
		
		Map<String, Object> parameters = new HashMap<>();
		
		parameters.put("period", period);
		
		//Fill Jasper report
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		//Export report
		
		JasperExportManager.exportReportToPdfStream(jasperPrint,response.getOutputStream());
	}

}

