package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.BeliBKDetail;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IBeliBKDetail  extends JpaRepository<BeliBKDetail,BigDecimal> {
	
	List<BeliBKDetail> findByBbdPoNoAndBbdTtbNo(String pono, String ttbno);
	
	List<BeliBKDetail> findByBbdPoNoAndBbdTtbNoAndBbdBhnCode(String pono, String ttbno, String bbcode);
	
	List<BeliBKDetail> findByBbdPoNoAndBbdNo(String pono, Integer bbdno);

}
