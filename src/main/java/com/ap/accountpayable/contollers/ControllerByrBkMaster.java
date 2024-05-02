package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.BayarBKMaster;
import com.ap.accountpayable.services.ServicesBayarBKMaster;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerByrBkMaster {
	@Autowired
	ServicesBayarBKMaster servByrBK;
	
	@GetMapping("/bayarbk/getbbyrbkmlist")
	public List<BayarBKMaster> getByrBKMaster(String thn, String bln, String novou){
		return servByrBK.getByrBKMaster(thn, bln, novou);
	}
	
	@GetMapping("/bayarbk/getbbyrbkmonthlist")
	public List<BayarBKMaster> getByrBKMstMonth(String dt){
		return servByrBK.getByrBKMstMonth(dt);
	}
	
	@PostMapping("/bayarbk/saveupdatebyrbk")
	public String saveUpdateBk(@RequestBody BayarBKMaster data) {
		return servByrBK.saveUpdateByrBKMaster(data);		
	}

}
