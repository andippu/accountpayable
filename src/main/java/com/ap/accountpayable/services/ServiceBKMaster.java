package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IBeliBKMaster;
import com.ap.accountpayable.models.BeliBKMaster;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceBKMaster {
	
	@Autowired
	IBeliBKMaster repoBKM;
	
	public List<BeliBKMaster> getBeliBKList(String splcode, String nopo, String nottb,  String dt){
		return repoBKM.getBeliBK(splcode, nopo, nottb, dt);
	}
	
	public List<BeliBKMaster> getBKMCU(String pono, String ttbno){
		return repoBKM.findByBbmNoPOAndBbmNoTtb(pono, ttbno);
	}
	
	public List<BeliBKMaster> getBeliBKListDtl(BigDecimal bbmId){
		return repoBKM.findByBbmId(bbmId);
	}
	
	@Transactional
	public String updateBeliBKMaster (String fisik, String btf, BigDecimal bmmId) {
		//System.out.println("aaaaaaaaaaaaaaaaaaaaaa : "+fisik);
		repoBKM.updateBBKM(fisik, btf, bmmId);
		/*List<BeliBKMaster> belimas =  repoBKM.findByBbmId(bmmId)	
			belimas.setBbmCekFisik(fisik);   
			belimas.setBbmBTF(btf);
		
		repoBKM.save(belimas);*/
		return "Update Successfully";
	}
	
	

}
