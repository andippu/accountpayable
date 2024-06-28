package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IBayarReturRepository;
import com.ap.accountpayable.models.BayarRetur;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceBayarRetur {
	@Autowired
	IBayarReturRepository repoByRt;
	
	public List<BayarRetur> getBayarReturList(String thn, String bln, String No, Integer spl){
		return repoByRt.findByByRtTahunAndByRtBulanAndByRtVoucherNoAndByRtSplCode(thn, bln, No, spl);
	}
	
	
	public String saveUpdateBayarRetur(BayarRetur br) {
		repoByRt.save(br);
		return "Submit Successfully";
	}
	
	public String execUpdate(String p_trans, String p_remno) {
		return repoByRt.execJurnalBayarBeli(p_trans, p_remno);		
	}

}
