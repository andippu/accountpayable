package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IBeliBKMaster;
import com.ap.accountpayable.Repository.IBeliBkCashMasterRepository;
import com.ap.accountpayable.models.BeliBKMaster;
import com.ap.accountpayable.models.BeliBkCashMaster;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceBeliBKCashMaster {
	@Autowired
	IBeliBkCashMasterRepository repoblcmst;
	
	public List<BeliBkCashMaster> getBeliBKListCash(String splcode, String nopo, String nottb,  String dt){
		return repoblcmst.getBeliBKCash(splcode, nopo, nottb, dt);
	}
	
	public List<BeliBkCashMaster> getBeliNotBKListCash(String splcode, String nopo, String nottb,  String dt){
		return repoblcmst.getBeliNotBKCash(splcode, nopo, nottb, dt);
	}
	
	public List<BeliBkCashMaster> getBKMCUCash(String pono, String ttbno){
		return repoblcmst.findByBbmCNoPOAndBbmCNoTtb(pono, ttbno);
	}
	
	public List<BeliBkCashMaster> getBeliBKListDtlCash(BigDecimal bbmId){
		return repoblcmst.findByBbmCId(bbmId);
	}
	
	public List<BeliBkCashMaster> getBeliSplListDtlCash(String spl){
		return repoblcmst.getRetBeliPoCash(spl);
	}
	
	public List<BeliBkCashMaster> getBeliPoListDtlCash(String pono){
		return repoblcmst.getRetBeliTtbCash(pono);
	}
	
	
	
	@Transactional
	public String updateBeliBKMasterCash (String fisik, String btf, BigDecimal bmmId) {
	//	System.out.println("aaaaaaaaaaaaaaaaaaaaaa : "+fisik+"/"+btf+"/"+bmmId);
		repoblcmst.updateBBKMCash(fisik, btf, bmmId);
		/*List<BeliBKMaster> belimas =  repoBKM.findByBbmId(bmmId)	
			belimas.setBbmCekFisik(fisik);   
			belimas.setBbmBTF(btf);
		
		repoBKM.save(belimas);*/
		return "Update Successfully";
	}
	

}
