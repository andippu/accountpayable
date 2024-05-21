package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IBeliBKMaster;
import com.ap.accountpayable.Repository.IVReturBeliBK;
import com.ap.accountpayable.models.BeliBKMaster;
import com.ap.accountpayable.models.VReturBeliBK;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceVReturBeliBK {
	@Autowired
	IVReturBeliBK repovret;
	
	public List<VReturBeliBK> getVReturList(String spl){
		return repovret.findByVretbbksplcode(spl);
	}
	
	public List<VReturBeliBK> getVReturPoList(String nopo){
		return repovret.findByVretbbkPoNo(nopo);
	}

}
