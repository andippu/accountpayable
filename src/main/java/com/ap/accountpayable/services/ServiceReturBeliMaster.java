package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IReturBeliMaster;
import com.ap.accountpayable.models.ReturBeliMaster;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceReturBeliMaster {
	
	@Autowired
	IReturBeliMaster repoRtrBlMst;
	
	public List<ReturBeliMaster> getReturBeliDay(String dt){
		return repoRtrBlMst.getReturBeliDay(dt);
	}
	
	public List<ReturBeliMaster> getReturBeliMonth(String dt){
		return repoRtrBlMst.getReturBeliMonth(dt);
	}
	
	
	public Optional<ReturBeliMaster> getReturBeliSingle(String remno){
		return repoRtrBlMst.findById(remno);
	}
}
