package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.BayarBKMaster;
import com.ap.accountpayable.models.ReturBeliMaster;
import com.ap.accountpayable.services.ServiceReturBeliMaster;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

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
	
	@GetMapping("/returbeli/getretursingle")
	public Optional<ReturBeliMaster> getReturSingle(String remno){
		return servRtrBlMs.getReturBeliSingle(remno);
	}
	
	@PostMapping("/returbeli/saveupdReturMaster")
	public String saveUpdateReturMaster(@RequestBody ReturBeliMaster data) {
		return servRtrBlMs.saveUpdateReturMaster(data);
	}
	
	@GetMapping("/returbeli/execpretrjurnal")
	public String ExecPReturJurnal(String p_thn , String p_bln , String p_no) {
		return servRtrBlMs.ExecPReturJurnal(p_thn, p_bln, p_no);
	}
}
