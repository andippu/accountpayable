package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.ITUploadPembelian;
import com.ap.accountpayable.models.TUploadPembelian;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceTUpPembelian {
	@Autowired
	ITUploadPembelian reporitup;
	
	public List<TUploadPembelian> getTUBList(){
		return reporitup.findAll();
	}

}
