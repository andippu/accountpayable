package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ap.accountpayable.Repository.IBayarBKMaster;
import com.ap.accountpayable.models.BayarBKMaster;

import jakarta.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServicesBayarBKMaster {
	@Autowired
	IBayarBKMaster repoByrBK;
	
	public List<BayarBKMaster> getByrBKMaster(String thn, String bln, String novou){
		return repoByrBK.getByrBKList(thn, bln, novou);
	}
	
	public List<BayarBKMaster> getByrBKMstMonth(String dt){
		return repoByrBK.getByrBKListMonth(dt);
	}
	
	public String saveUpdateByrBKMaster (BayarBKMaster data) {
		repoByrBK.save(data);
		return "Submit Successfully";
	}
	
	public String execPBayarJurnal(String p_bymtahun , String p_bymbulan , String p_bymno , BigDecimal p_bymamount) {
		return repoByrBK.execPBayarJurnal(p_bymtahun, p_bymbulan, p_bymno, p_bymamount);		
	}
}
