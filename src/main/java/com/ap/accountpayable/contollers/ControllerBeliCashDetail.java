package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.BeliBkCashDetail;
import com.ap.accountpayable.services.ServiceBeliCashDetail;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerBeliCashDetail {
	@Autowired
	ServiceBeliCashDetail servbcash;
	
	@GetMapping("/belibk/getbbkdListcash")
	public List<BeliBkCashDetail> getBBDList(String pono, String ttbno) {
		return servbcash.getBBDList(pono, ttbno);
	}
	
	@GetMapping("/belibk/getbbkdcucash")
	public List<BeliBkCashDetail> getBBDCU (String pono, Integer bbdno){
		return servbcash.getBBDCU(pono, bbdno);
	}
	
	@GetMapping("/belibk/getretbbkdListcash")
	public List<BeliBkCashDetail> getReturBBDList(String pono, String ttbno, String bbcode) {
		return servbcash.getRetBBDList(pono, ttbno, bbcode);
	}
}
