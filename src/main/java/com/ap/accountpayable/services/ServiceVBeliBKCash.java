package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IVBeliBKCash;
import com.ap.accountpayable.models.VBeliBKCash;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceVBeliBKCash {
	@Autowired
	IVBeliBKCash repovcash;
	
	public List<VBeliBKCash> getBeliBKTotal (String pono, String ttbno){
		return repovcash.findByVbbkCPoNoAndVbbkCTbbNo(pono, ttbno);
	}

}
