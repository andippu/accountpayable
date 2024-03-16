package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IBeliBKDetail;
import com.ap.accountpayable.models.BeliBKDetail;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceBKDetail {
	@Autowired
	IBeliBKDetail repoBKD;
	
	public List<BeliBKDetail> getBBDList(String pono, String ttbno) {
		return repoBKD.findByBbdPoNoAndBbdTtbNo(pono, ttbno);
	}
	
	public List<BeliBKDetail> getBBDCU (String pono, Integer bbdno){
		return repoBKD.findByBbdPoNoAndBbdNo(pono, bbdno);
	}

}
