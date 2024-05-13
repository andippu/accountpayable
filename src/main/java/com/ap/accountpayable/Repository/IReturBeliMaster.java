package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.BeliBKMaster;
import com.ap.accountpayable.models.ReturBeliMaster;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReturBeliMaster extends JpaRepository<ReturBeliMaster, String> {
	
	@Query(value="SELECT * FROM RETUR_BELI_MASTER s WHERE to_char(s.REM_DATE,'Mon dd yyyy') =:dt ", nativeQuery = true )
	public List<ReturBeliMaster> getReturBeliDay(String dt);
	
	@Query(value="SELECT * FROM RETUR_BELI_MASTER s WHERE to_char(s.REM_DATE,'Monyyyy') =:dt ", nativeQuery = true )
	public List<ReturBeliMaster> getReturBeliMonth(String dt);
	
	

}
