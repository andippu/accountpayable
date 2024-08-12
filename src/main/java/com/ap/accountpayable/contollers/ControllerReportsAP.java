package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.ReportOutstandingHutang;
import com.ap.accountpayable.services.ServiceReportLapBeliBahanMonthly;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperExportManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class ControllerReportsAP {
	@Autowired
	ServiceReportLapBeliBahanMonthly servRLBM;
	
	
	 @GetMapping("/pdf/reporLapBeliBahanMontly")
	 public void createPDF(String period, HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Laporan Pembelian Dagang Bulanan " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRLBM.tJaLapBeliBahanMonthly(period, response);	 
	    }
	 
	 @GetMapping("/pdf/reporLapBeliBahanMontlyBiaya")
	 public void createPDFBiaya(String period,  HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Laporan Pembelian Biaya Bulanan  " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRLBM.tJaLapBeliBahanMonthlyBiaya(period, response);
	    }
	
	 @GetMapping("/pdf/reporLapBeliBahanMontlyOther")
	 public void createPDFOther(String period,  HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Laporan Pembelian Lain-Lain Bulanan  " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRLBM.tJaLapBeliBahanMonthlyOther(period, response);
	    }
	 
	 @GetMapping("/pdf/reportAPInfo")
	 public void createPDFApInfo(String nopo,  HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Account Payable - Info  " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRLBM.tJaLapAPInfo(nopo, response);
	    }
	 
	 @GetMapping("/pdf/reportOutsHutang")
	 public void createPDFOutsHut(String splcode, String pdate1, String pdate2,  HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Outstanding Hutang " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRLBM.tJaLapOutstandingHutang(splcode, pdate1, pdate2, response);
	    }
	 
	 @GetMapping("/pdf/reporttdtrfpajak")
	 public void createPDFOutsHut(String period,  HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Tanda Terima F.Pajak " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRLBM.tJaLapTandaTerimaFPajak(period, response);
	    }
	 
	 @GetMapping("/pdf/reportunpaidap")
	 public void createUnpaidAP(String pdate, String ptype,  HttpServletResponse response) throws IOException, JRException {
	       response.setContentType("application/pdf");
	       DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	       String currentDateTime = dateFormatter.format(new Date());
	       String headerKey = "Content-Disposition";
	       String headerValue = "attachment; filename=Tanda Unpaid Account Payable " + currentDateTime + ".pdf";
	       response.setHeader(headerKey, headerValue);
	       servRLBM.tJaLapUnpaidAP(pdate, ptype, response);
	    }
	 
	 
	 @GetMapping("/pdf/reportOutsHutang2")
	 public List<ReportOutstandingHutang> getouthut(String splcode, String pdate1, String pdate2){
		 System.out.println("aaaaaaa : "+splcode+"--"+pdate1+"---"+pdate2+"---");
		 return servRLBM.tJaLapOutstandingHutang2(splcode, pdate1, pdate2);
	 }
	 
	 
	 @GetMapping("/pdf/reportAPInfo2")
	 public ResponseEntity<byte[]> generateReport(String nopo) {
	        try {
	            JasperPrint jasperPrint = servRLBM.generateReport(nopo);
	            byte[] data = JasperExportManager.exportReportToPdf(jasperPrint);

	            HttpHeaders headers = new HttpHeaders();
	            headers.set(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=report.pdf");
	            headers.setContentType(MediaType.APPLICATION_PDF);

	            return ResponseEntity.ok().headers(headers).body(data);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(500).build();
	        }
	    }
}
