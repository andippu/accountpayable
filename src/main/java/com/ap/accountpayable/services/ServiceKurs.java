package com.ap.accountpayable.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ap.accountpayable.Repository.IKursRepository;
import com.ap.accountpayable.models.Kurs;

import java.util.List;

@Service
public class ServiceKurs {
	  @Autowired
	IKursRepository repoKurs;
	  
	 
	
	public List<Kurs> getkursWithOutList (String kurscd){
		return repoKurs.findByKursDescNotLike(kurscd);
	}

}