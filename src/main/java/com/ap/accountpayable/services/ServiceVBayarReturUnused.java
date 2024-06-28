package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IBayarReturUnsed;
import com.ap.accountpayable.models.VBayarReturUnused;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceVBayarReturUnused {
	@Autowired
	IBayarReturUnsed repoBRU;
	
	public List<VBayarReturUnused> getReturUnsedList(Integer Spl){
		return repoBRU.findByVrbuuSplCode(Spl);
		
	}

}
