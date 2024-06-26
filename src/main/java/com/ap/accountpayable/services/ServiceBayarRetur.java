package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IByarReturRepository;
import com.ap.accountpayable.models.BayarRetur;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceBayarRetur {
	@Autowired
	IByarReturRepository repoByRt;
	
	public List<BayarRetur> getBayarReturList(String thn, String bln, String No){
		return repoByRt.findByByRtTahunAndByRtBulanAndByRtVoucherNo(thn, bln, No);
	}
	
	
	
	public String saveUpdateBayarRetur(BayarRetur br) {
		repoByRt.save(br);
		return "Submit Successfully";
	}

}
