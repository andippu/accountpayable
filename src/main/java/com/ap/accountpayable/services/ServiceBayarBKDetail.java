package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IBayarBKDetail;
import com.ap.accountpayable.models.BayarBKDetail;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServiceBayarBKDetail {
	@Autowired
	IBayarBKDetail repoByDtl;
	
	public List<BayarBKDetail> getByrBKList(String thn, String bln, String no){
		return repoByDtl.findByByrdBymTahunAndByrdBymBulanAndByrdBymNo(thn, bln, no);
	}
	
	public List<BayarBKDetail> getByrBKSingle(BigDecimal byrno){
		return repoByDtl.findByByrdNo(byrno);
	}
	
	public String saveUpdateBkDtl(BayarBKDetail data) {
		repoByDtl.save(data);
		return "Submit Successfully";
	}
	
}
