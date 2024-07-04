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
	
	 public void checkTUpPembelian() {
	        List<TUploadPembelian> tup = reporitup.findAll(); // You can use findBy<YourField> if needed

	        if (!tup.isEmpty()) {
	        	reporitup.deleteAll();
	            System.out.println("Data deleted successfully");
	        } else {
	            System.out.println("No data found in the table");
	        }
	    }
	 
	 public String insTUpbeli (TUploadPembelian data){
		 reporitup.save(data);
		 String temp=reporitup.execuploadbeli();
		 System.out.println("temp :"+temp);
	       return "Upload CSV Success";
	    }
	 
	 public String execPTUpBeli() {
		 return reporitup.execuploadbeli();
	 }
	 
	 public String execProseBeli() {
		 return reporitup.execProsesBeli();
	 }
	 
	 public String execProseBeliLain() {
		 return reporitup.execProsesBeliLain();
	 }
}
