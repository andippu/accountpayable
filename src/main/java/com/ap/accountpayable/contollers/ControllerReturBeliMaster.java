package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.ReturBeliMaster;
import com.ap.accountpayable.services.ServiceReturBeliMaster;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerReturBeliMaster {

	@Autowired
	ServiceReturBeliMaster servRtrBlMs;
	
	@GetMapping("/returbeli/getrtrdaylist")
	public List<ReturBeliMaster> getReturBeliDay(String dt){
		return servRtrBlMs.getReturBeliDay(dt);
	}
	
	@GetMapping("/returbeli/getrtrmonthlist")
	public List<ReturBeliMaster> getReturBeliMonth(String dt){
		return servRtrBlMs.getReturBeliMonth(dt);
	}
}
