package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ap.accountpayable.models.Kurs;
import com.ap.accountpayable.models.ReportBeliBelumLunas;
import com.ap.accountpayable.models.ReportCoaBeliLain;
import com.ap.accountpayable.models.ReportOutstandingHutang;
import com.ap.accountpayable.services.ServiceKurs;
import com.ap.accountpayable.services.ServiceReportLapBeliBahanMonthly;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperExportManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@CrossOrigin("http://localhost:4200")
public class ControllerReportsAP {
	@Autowired
	ServiceReportLapBeliBahanMonthly servRLBM;
	@Autowired
	ServiceKurs servkurs;
	
	 private final Path fileStorageLocation = Paths.get("D:\\UPLOADFILES");
	
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
	 
	 @GetMapping("/excel/getbelibelumlunas")
	 public List<ReportBeliBelumLunas> getAllList(String pdate, String pdate2, byte choice) throws JRException, IOException  {
		return servRLBM.tJaLapBeliBelumLunas(pdate, pdate2, choice);
	  }
	 
	 @GetMapping("/excel/reportcoablmlns")
	 public List<ReportCoaBeliLain> tJaLapCoaBeliLain(String pdate) throws JRException, IOException {
			
			return servRLBM.tJaLapCoaBeliLain(pdate);
	}
	 
	 
	 // hutang umum idr
	 @GetMapping("/closeumumidr/hutdgIdrExcel")
		public ResponseEntity<Resource> HutangDagangExcel(@RequestParam String filename, String bulan) {
		    	String temp = servRLBM.getHutangDagangIdrExcel(bulan, filename);
		    	String fl=filename+" "+bulan+".xml";
		    	
		        try {
		        	
		            Path filePath = fileStorageLocation.resolve(fl).normalize();
		            Resource resource = new UrlResource(filePath.toUri());

		            if (resource.exists()) {
		                String contentType = "application/octet-stream";
		                return ResponseEntity.ok()
		                        .contentType(org.springframework.http.MediaType.parseMediaType(contentType))
		                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
		                        .body(resource);
		            } else {
		                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		            }
		        } catch (IOException ex) {
		            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		        }
		}
	 
	 @GetMapping("/closeumumidr/hutdgIdr")
		public ResponseEntity<Resource> LapHutangIDR(@RequestParam String filename, String bulan) {
		    	String temp = servRLBM.getLapHutangDagangIdr(bulan, filename);
		    	String fl=filename+" "+bulan+".xml";
		    	System.out.println("aaaaa : "+fl);
		        try {
		        	
		            Path filePath = fileStorageLocation.resolve(fl).normalize();
		            Resource resource = new UrlResource(filePath.toUri());

		            if (resource.exists()) {
		                String contentType = "application/octet-stream";
		                return ResponseEntity.ok()
		                        .contentType(org.springframework.http.MediaType.parseMediaType(contentType))
		                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
		                        .body(resource);
		            } else {
		                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		            }
		        } catch (IOException ex) {
		            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		        }
		}
	 
	 @GetMapping("/closeumumidr/runcloseumumidr")
	 public String runCloseHutangUmumIdr(String pnys) throws JRException, IOException {
			return servRLBM.runCloseHutangUmumIdr(pnys);
	}
	
	 @GetMapping("/closeumumidr/postumumidr")
	 public String getPostHutangUmuIdr(String bulan) throws JRException, IOException {
			return servRLBM.getPostHutangUmuIdr(bulan);
	}
	 
	 //hutang umum valas	 
	 @GetMapping("/closeumumval/hutdgvalExcel")
		public  ResponseEntity<Resource> HutangDagangValExcel(@RequestParam String filename, String bulan) {
		    	String temp = servRLBM.getHutangDagangValasExcel(bulan, filename);	
		    	
		    	
		        List<Kurs> kr = servkurs.getkursWithOutList("IDR");
		        
		        for (int i = 0; i < kr.size(); i++) {
		    	
		        	String fl=filename+kr.get(i).getKursDesc()+" "+bulan+".xml";
		        	System.out.println("zzzzzzzzzzzzzzzzzz : "+filename+kr.get(i).getKursDesc()+" "+bulan+".xml");
		    	    try {
		        	
		    	    	Path filePath = fileStorageLocation.resolve(fl).normalize();
		    	    	Resource resource = new UrlResource(filePath.toUri());

		    	    	if (resource.exists()) {
		    	    		String contentType = "application/octet-stream";
		    	    		return ResponseEntity.ok()
		                        .contentType(org.springframework.http.MediaType.parseMediaType(contentType))
		                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
		                        .body(resource);
		    	    	} else {
		    	    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		    	    	}
		    	    } catch (IOException ex) {
		    	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		    	    }
		        }	
		        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	 
	 @GetMapping("/closeumumval/runcloseumumval")
	 public String runCloseHutangUmumValas(String pnys) throws JRException, IOException {
			return servRLBM.runCloseHutangValas(pnys);
	}
	 
	 // hutang Lain-Lain idr
	 @GetMapping("/closelainidr/hutlainIdrExcel")
		public ResponseEntity<Resource> HutangLainExcel(@RequestParam String filename, String bulan) {
		    	String temp = servRLBM.getHutangLainIdrExcel(bulan, bulan);
		    	String fl=filename+" "+bulan+".xml";
		    	
		        try {
		        	
		            Path filePath = fileStorageLocation.resolve(fl).normalize();
		            Resource resource = new UrlResource(filePath.toUri());

		            if (resource.exists()) {
		                String contentType = "application/octet-stream";
		                return ResponseEntity.ok()
		                        .contentType(org.springframework.http.MediaType.parseMediaType(contentType))
		                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
		                        .body(resource);
		            } else {
		                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		            }
		        } catch (IOException ex) {
		            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		        }
		}
	 
	 @GetMapping("/closelainidr/hutlainIdr")
		public ResponseEntity<Resource> LapHutangLainIDR(@RequestParam String filename, String bulan) {
		    	String temp = servRLBM.getLapHutangDagangIdr(bulan, filename);
		    	String fl=filename+" "+bulan+".xml";
		    	System.out.println("aaaaa : "+fl);
		        try {
		        	
		            Path filePath = fileStorageLocation.resolve(fl).normalize();
		            Resource resource = new UrlResource(filePath.toUri());

		            if (resource.exists()) {
		                String contentType = "application/octet-stream";
		                return ResponseEntity.ok()
		                        .contentType(org.springframework.http.MediaType.parseMediaType(contentType))
		                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
		                        .body(resource);
		            } else {
		                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		            }
		        } catch (IOException ex) {
		            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		        }
		}
	 
	 @GetMapping("/closelainidr/runcloselainidr")
	 public String runCloseHutanglainIdr(String pnys) throws JRException, IOException {
			return servRLBM.runCloseHutangLainIdr(pnys);
	}
	
	 @GetMapping("/closelainidr/postlainidr")
	 public String getPostHutangLainIdr(String bulan) throws JRException, IOException {
			return servRLBM.getPostHutangLainIdr(bulan);
	}
	 
	//hutang lain-lain valas	 
	 @GetMapping("/closelainval/hutlainvalExcel")
		public  ResponseEntity<Resource> HutangLainValExcel(@RequestParam String filename, String bulan) {
		    	String temp = servRLBM.getHutangLainValasExcel(bulan, bulan);
		    	
		        List<Kurs> kr = servkurs.getkursWithOutList("IDR");
		        
		        for (int i = 0; i < kr.size(); i++) {
		    	
		        	String fl=filename+kr.get(i).getKursDesc()+" "+bulan+".xml";
		        	System.out.println("zzzzzzzzzzzzzzzzzz : "+filename+kr.get(i).getKursDesc()+" "+bulan+".xml");
		    	    try {
		        	
		    	    	Path filePath = fileStorageLocation.resolve(fl).normalize();
		    	    	Resource resource = new UrlResource(filePath.toUri());

		    	    	if (resource.exists()) {
		    	    		String contentType = "application/octet-stream";
		    	    		return ResponseEntity.ok()
		                        .contentType(org.springframework.http.MediaType.parseMediaType(contentType))
		                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
		                        .body(resource);
		    	    	} else {
		    	    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		    	    	}
		    	    } catch (IOException ex) {
		    	    	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		    	    }
		        }	
		        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	 
	 @GetMapping("/closelainval/runcloselainval")
	 public String runCloseHutangLainValas(String pnys) throws JRException, IOException {
			return servRLBM.runCloseHutangLainValas(pnys);
	}
	 
	 
	//hutang Biaya IDR	
	 @GetMapping("/closebiayaidr/hutbiayaIdr")
		public ResponseEntity<Resource> LapHutangBiayaIDR(@RequestParam String filename, String bulan) {
		    	String temp = servRLBM.getHutangBiayaIdrExcel(bulan, bulan);
		    	String fl=filename+" "+bulan+".xml";
		    	System.out.println("aaaaa : "+fl);
		        try {
		        	
		            Path filePath = fileStorageLocation.resolve(fl).normalize();
		            Resource resource = new UrlResource(filePath.toUri());

		            if (resource.exists()) {
		                String contentType = "application/octet-stream";
		                return ResponseEntity.ok()
		                        .contentType(org.springframework.http.MediaType.parseMediaType(contentType))
		                        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
		                        .body(resource);
		            } else {
		                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		            }
		        } catch (IOException ex) {
		            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		        }
		}
	 
	 @GetMapping("/closebiayaidr/runclosebiayaidr")
	 public String runCloseHutangbiayaIdr(String pnys) throws JRException, IOException {
			return servRLBM.runCloseHutangBiayaIdr(pnys);
	}
	
	 @GetMapping("/closebiayaidr/postbiayaidr")
	 public String getPostHutangBiayaIdr(String bulan) throws JRException, IOException {
			return servRLBM.getPostHutangBiayaIdr(bulan);
	}
}
