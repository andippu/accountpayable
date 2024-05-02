package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IReturBeliDetail;
import com.ap.accountpayable.models.ReturBeliDetail;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceReturBeliDetail {

	@Autowired
	IReturBeliDetail repoRtrBldtl;
	
	public List<ReturBeliDetail> getReturBeliDtl(String rtNo){
		return repoRtrBldtl.findByRtBlDtlNo(rtNo);
	}
	
}
