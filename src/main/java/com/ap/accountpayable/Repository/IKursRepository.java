package com.ap.accountpayable.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.Kurs;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IKursRepository  extends JpaRepository<Kurs, String> {
	
	public List<Kurs> findByKursDescNotLike(String kurscode);

}