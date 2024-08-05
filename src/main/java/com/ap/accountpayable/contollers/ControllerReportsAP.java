package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.services.ServiceReportLapBeliBahanMonthly;

import net.sf.jasperreports.engine.JRException;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;

@RestController 
public class ControllerReportsAP {
	@Autowired
	ServiceReportLapBeliBahanMonthly servRLBM;
	
	 @GetMapping("/pdf/reporLapBeliBahanMontly")
	 public void createPDF(String period, String cuscode, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Laporan Pembelian Dagang Bulanan " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRLBM.tJaLapBeliBahanMonthly(period, response);
	     //  return "Report Has bee Download";
	    }
}
