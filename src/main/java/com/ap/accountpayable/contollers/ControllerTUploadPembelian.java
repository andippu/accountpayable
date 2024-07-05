package com.ap.accountpayable.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.accountpayable.models.TUploadPembelian;
import com.ap.accountpayable.services.ServiceTUpPembelian;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:4200")
public class ControllerTUploadPembelian {
	@Autowired
	ServiceTUpPembelian sertup;
	
	@GetMapping("/tupbeli/getupbllist")
	public List<TUploadPembelian> getTUBList(){
		return sertup.getTUBList();
	}
	
	 @GetMapping("/tupbeli/checktupbeli")
	 public String checkTUpBeli() {
		 sertup.checkTUpPembelian();
	     return "Check and delete Temp Faktur performed";
	 }
	 
	 @GetMapping("/tupbeli/exectupbeli")
	 public String execTUpBeli() {
		return sertup.execPTUpBeli();
	 }
	 
	 @GetMapping("/tupbeli/execprosesbeli")
	 public String execProsesBeli() {
		return sertup.execProseBeli();
	 }
	 
	 @GetMapping("/tupbeli/execprosesbelilain")
	 public String execProsesBeliLain() {
		return sertup.execProseBeliLain();
	 }
	 
	 @PostMapping("/tupbeli/addtupbeli")	  
	 public String insTUpbeli ( @RequestBody TUploadPembelian data) throws IOException {	     
	      return sertup.insTUpbeli(data);
	  }
}
