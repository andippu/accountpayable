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
	
	public String execJurnalBayarBeli(String p_bymtahun , String p_bymbulan , String p_bymno , BigDecimal p_bymamoun){
		return repoByDtl.execJurnalBayarBeli(p_bymtahun, p_bymbulan, p_bymno, p_bymamoun);
	}
	
	public String saveUpdateBkDtl(BayarBKDetail data) {
		repoByDtl.save(data);
		return "Submit Successfully";
	}
	
}
