package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.VBeliBK;
import com.ap.accountpayable.models.VBeliBKCash;
import com.ap.accountpayable.models.VBeliBKCashCompKey;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IVBeliBKCash extends JpaRepository<VBeliBKCash,VBeliBKCashCompKey>{
	
	List<VBeliBKCash> findByVbbkCPoNoAndVbbkCTbbNo(String pono, String ttbno);

}
