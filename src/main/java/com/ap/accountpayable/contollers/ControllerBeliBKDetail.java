package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.BeliBKDetail;
import com.ap.accountpayable.services.ServiceBKDetail;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerBeliBKDetail {
	@Autowired
	ServiceBKDetail servBBD;
	
	@GetMapping("/belibk/getbbkdList")
	public List<BeliBKDetail> getBBDList(String pono, String ttbno) {
		return servBBD.getBBDList(pono, ttbno);
	}
	
	@GetMapping("/belibk/getbbkdcu")
	public List<BeliBKDetail> getBBDCU (String pono, Integer bbdno){
		return servBBD.getBBDCU(pono, bbdno);
	}
	
	@GetMapping("/belibk/getretbbkdList")
	public List<BeliBKDetail> getReturBBDList(String pono, String ttbno, String bbcode) {
		return servBBD.getRetBBDList(pono, ttbno, bbcode);
	}
	

}
