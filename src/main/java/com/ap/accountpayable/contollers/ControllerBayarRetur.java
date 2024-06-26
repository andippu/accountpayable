package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.BayarRetur;
import com.ap.accountpayable.services.ServiceBayarRetur;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerBayarRetur {
	@Autowired
	ServiceBayarRetur servByRetur;
	
	@GetMapping("/byretur/getbyrretrlist")
	public List<BayarRetur> getBayarReturList(String thn, String bln, String No){
		return servByRetur.getBayarReturList(thn, bln, No);
	}
	
	@PostMapping("/byretur/addupdatebyretur")	
	public String saveUpdateBayarRetur(@RequestBody BayarRetur br) {
		return servByRetur.saveUpdateBayarRetur(br);
	}
}
