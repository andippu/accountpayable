package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.BayarBKDetail;
import com.ap.accountpayable.services.ServiceBayarBKDetail;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerByrBKDetail {
	@Autowired
	ServiceBayarBKDetail servByrDtl;
	
	@GetMapping("/bayarbkdtl/getbbyrbkdtllist")
	public List<BayarBKDetail> getByrBKList(String thn, String bln, String no){
		return servByrDtl.getByrBKList(thn, bln, no);
	}
	
	@GetMapping("/bayarbkdtl/jurnalbayarbeli")
	public String execJurnalBayarBeli(String p_bymtahun , String p_bymbulan , String p_bymno , BigDecimal p_bymamoun){
		return servByrDtl.execJurnalBayarBeli(p_bymtahun, p_bymbulan, p_bymno, p_bymamoun);
	}
	
	@PostMapping("/bayarbkdtl/saveupdatebyrbkdtl")
	public String saveUpdateBkDtl(@RequestBody BayarBKDetail data) {
		return servByrDtl.saveUpdateBkDtl(data);		
	}
	
	
}
