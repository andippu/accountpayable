package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IBeliBKMaster;
import com.ap.accountpayable.models.BeliBKMaster;

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
	
	

}
