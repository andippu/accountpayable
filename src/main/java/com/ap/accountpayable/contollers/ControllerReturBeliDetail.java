package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.ReturBeliDetail;
import com.ap.accountpayable.models.ReturBeliMaster;
import com.ap.accountpayable.services.ServiceReturBeliDetail;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerReturBeliDetail {
	@Autowired
	ServiceReturBeliDetail servRtDtl;
	
	@GetMapping("/returbeli/getrtrdtlbyno")
	public List<ReturBeliDetail> getReturBeliDay(String rtNo){
		return servRtDtl.getReturBeliDtl(rtNo);
	}
	
	@GetMapping("/returbeli/getrtrdtsingle")
	public List<ReturBeliDetail> getRtrDtlSingle(String rtNo, String rtkb){
		return servRtDtl.getRtrDtlSingle(rtNo, rtkb);
	}
	
	@PostMapping("/returbeli/saveupdReturDetail")
	public String saveUpdateReturDetail(@RequestBody ReturBeliDetail data) {
		return servRtDtl.saveUpdateReturDetail(data);
	}


}
