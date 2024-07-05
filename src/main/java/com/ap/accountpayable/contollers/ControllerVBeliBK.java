package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.VBeliBK;
import com.ap.accountpayable.services.ServiceVBeliBK;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerVBeliBK {
	@Autowired
	ServiceVBeliBK servVBBK;
	
	@GetMapping("/pboto/getvtupolist")
	public List<VBeliBK> getBeliBKTotal (String pono, String ttbno){
		return servVBBK.getBeliBKTotal(pono, ttbno);
	}

}
