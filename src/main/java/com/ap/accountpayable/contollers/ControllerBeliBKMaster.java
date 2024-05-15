package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.BeliBKMaster;
import com.ap.accountpayable.services.ServiceBKMaster;

import java.math.BigDecimal;
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
	
	@GetMapping("/belibk/getbnotbkmlist")
	public List<BeliBKMaster> getBeliNotBKList(String splcode, String nopo, String nottb, String dt){
		return servBK.getBeliNotBKList(splcode, nopo, nottb, dt);
	}
	
	@GetMapping("/belibk/getbbkmcu")
	public List<BeliBKMaster> getBKMCU(String pono, String ttbno){
		return servBK.getBKMCU(pono, ttbno);
	}
	
	@GetMapping("/belibk/getbbkmlistdtl")
	public List<BeliBKMaster> getBeliBKListDtl(BigDecimal bbmId){
		return servBK.getBeliBKListDtl(bbmId);
	}
	
	@GetMapping("/belibk/getReturPolist")
	public List<BeliBKMaster> getBeliSplListDtl(String spl){
		return servBK.getBeliSplListDtl(spl);
	}
	
	@GetMapping("/belibk/getReturTtblist")
	public List<BeliBKMaster>  getBeliPoListDtl(String nopo){
		return servBK.getBeliPoListDtl(nopo);
	}
	
	@GetMapping("/belibk/updatebbkm")
	public String updateBeliBKMaster (String fisik, String btf, BigDecimal bmmId) {
		return servBK.updateBeliBKMaster(fisik, btf, bmmId);
		
	}
	
	

}
