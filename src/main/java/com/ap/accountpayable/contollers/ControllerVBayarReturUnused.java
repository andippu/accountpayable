package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.VBayarReturUnused;
import com.ap.accountpayable.services.ServiceVBayarReturUnused;


import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerVBayarReturUnused {
	@Autowired
	ServiceVBayarReturUnused serVBRU;
	
	@GetMapping("/returunused/getbyrreturunused")
	public List<VBayarReturUnused> getReturUnsedList(Integer Spl){
		return serVBRU.getReturUnsedList(Spl)	;
	}
	

}
