package com.ap.accountpayable.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
	
	public List<ReturBeliDetail> getRtrDtlSingle(String rtNo, String rtkb){
		return repoRtrBldtl.findByRtBlDtlNoAndRtBlDtlKdBhn(rtNo, rtkb);
	}
	
	public String saveUpdateReturDetail (@RequestBody ReturBeliDetail rbd ) {
		repoRtrBldtl.save(rbd);
		return "Submit Successfully";
	}

	
}
