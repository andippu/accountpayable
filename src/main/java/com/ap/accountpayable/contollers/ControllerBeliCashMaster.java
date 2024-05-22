package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.BeliBKMaster;
import com.ap.accountpayable.models.BeliBkCashMaster;
import com.ap.accountpayable.services.ServiceBeliCashMaster;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerBeliCashMaster {
	@Autowired
	ServiceBeliCashMaster servBlC;
	
	@GetMapping("/belibk/getbbkmlistcash")
	public List<BeliBkCashMaster> getBeliBKList(String splcode, String nopo, String nottb, String dt){
		return servBlC.getBeliBKListCash(splcode, nopo, nottb, dt);
	}
	
	@GetMapping("/belibk/getbnotbkmlistcash")
	public List<BeliBkCashMaster> getBeliNotBKList(String splcode, String nopo, String nottb, String dt){
		return servBlC.getBeliNotBKListCash(splcode, nopo, nottb, dt);
	}
	
	@GetMapping("/belibk/getbbkmcucash")
	public List<BeliBkCashMaster> getBKMCU(String pono, String ttbno){
		return servBlC.getBKMCUCash(pono, ttbno);
	}
	
	@GetMapping("/belibk/getbbkmlistdtlcash")
	public List<BeliBkCashMaster> getBeliBKListDtl(BigDecimal bbmId){
		return servBlC.getBeliBKListDtlCash(bbmId);
	}
	
	@GetMapping("/belibk/getReturPolistcash")
	public List<BeliBkCashMaster> getBeliSplListDtl(String spl){
		return servBlC.getBeliSplListDtlCash(spl);
	}
	
	@GetMapping("/belibk/getReturTtblistcash")
	public List<BeliBkCashMaster>  getBeliPoListDtl(String nopo){
		return servBlC.getBeliPoListDtlCash(nopo);
	}
	
	@GetMapping("/belibk/updatebbkmcash")
	public String updateBeliBKMaster (String fisik, String btf, BigDecimal bmmId) {
		return servBlC.updateBeliBKMasterCash(fisik, btf, bmmId);
		
	}
	

}
