package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IVBeliBK;
import com.ap.accountpayable.models.VBeliBK;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceVBeliBK {
	@Autowired
	IVBeliBK repovBBK;
	
	public List<VBeliBK> getBeliBKTotal (String pono, String ttbno){
		return repovBBK.findByVbbkPoNoAndVbbkTbbNo(pono, ttbno);
	}
	

}
