package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.VPurchaseUnpaid;
import com.ap.accountpayable.services.ServiceVPurchaseUnpaid;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")


public class ControllerVPurchaseUnpaid {
	@Autowired
	ServiceVPurchaseUnpaid servPurcUnpaid;
	
	@GetMapping("/bayarbk/unpaidlist")
	public List<VPurchaseUnpaid> getPurchaseUnpaidList(){
		return servPurcUnpaid.getPurchaseUnpaidList();		
	}

}
