package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.BeliBKMaster;
import com.ap.accountpayable.models.VReturBeliBK;
import com.ap.accountpayable.services.ServiceBKMaster;
import com.ap.accountpayable.services.ServiceVReturBeliBK;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerVReturBeliBK {
	@Autowired
	ServiceVReturBeliBK servret;
	
	@GetMapping("/vreturbelibk/getvreturbelilist")
	public List<VReturBeliBK> getVReturList(String spl){
		return servret.getVReturList(spl);
	}
}
