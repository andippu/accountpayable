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
	
	@GetMapping("/bayarbkdtl/getbbyrbkdtsingle")
	public List<BayarBKDetail> getByrBKSingle(BigDecimal byrno){
		return servByrDtl.getByrBKSingle(byrno);
	}
	
	@PostMapping("/bayarbkdtl/saveupdatebyrbkdtl")
	public String saveUpdateBkDtl(@RequestBody BayarBKDetail data) {
		return servByrDtl.saveUpdateBkDtl(data);		
	}
	
	
}
