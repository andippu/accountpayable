package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IBeliCashDetailRepository;
import com.ap.accountpayable.models.BeliBkCashDetail;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceBeliCashDetail {
	@Autowired
	IBeliCashDetailRepository repoBCash;
	
	public List<BeliBkCashDetail> getBBDList(String pono, String ttbno) {
		return repoBCash.findByBbdCPoNoAndBbdCTtbNo(pono, ttbno);
	}
	
	public List<BeliBkCashDetail> getBBDCU (String pono, Integer bbdno){
		return repoBCash.findByBbdCPoNoAndBbdCNo(pono, bbdno);
	}
	
	public List<BeliBkCashDetail> getRetBBDList (String pono, String ttbno, String bbcode){
		return repoBCash.findByBbdCPoNoAndBbdCTtbNoAndBbdCBhnCode(pono, ttbno, bbcode);
	}

}
