package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.BeliBkCashDetail;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface IBeliCashDetailRepository extends JpaRepository<BeliBkCashDetail,BigDecimal>{
	
	List<BeliBkCashDetail> findByBbdCPoNoAndBbdCTtbNo(String pono, String ttbno);
	
	List<BeliBkCashDetail> findByBbdCPoNoAndBbdCTtbNoAndBbdCBhnCode(String pono, String ttbno, String bbcode);
	
	List<BeliBkCashDetail> findByBbdCPoNoAndBbdCNo(String pono, Integer bbdno);
}
