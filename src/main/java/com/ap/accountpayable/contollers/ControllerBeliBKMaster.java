package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.BeliBKMaster;
import com.ap.accountpayable.services.ServiceBKMaster;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerBeliBKMaster {
	@Autowired
	ServiceBKMaster servBK;
	
	@GetMapping("/belibk/getbbkmlist")
	public List<BeliBKMaster> getBeliBKList(String splcode, String nopo, String nottb, String dt){
		return servBK.getBeliBKList(splcode, nopo, nottb, dt);
	}
	
	

}
