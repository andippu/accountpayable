package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IBeliBKMaster;
import com.ap.accountpayable.Repository.IPurchaseUnpaid;
import com.ap.accountpayable.models.VPurchaseUnpaid;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceVPurchaseUnpaid {
	@Autowired
	IPurchaseUnpaid repoVPUnpaid;
	
	public List<VPurchaseUnpaid> getPurchaseUnpaidList(String ttbno, String pono){
		return repoVPUnpaid.findByVbyupTtbAndVbyupPo(ttbno, pono);		
	}
	
	public List<VPurchaseUnpaid> getPurchaseUnpaidList(){
		return repoVPUnpaid.findAll();		
	}
	
	
	
}
