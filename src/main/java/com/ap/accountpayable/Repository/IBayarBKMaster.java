package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.BayarBKMaster;
import com.ap.accountpayable.models.BayarBKMasterCompKey;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IBayarBKMaster extends JpaRepository<BayarBKMaster,BayarBKMasterCompKey> {
	
	@Query(value="SELECT * FROM BAYAR_BK_MASTER S WHERE BYM_TAHUN||BYM_BULAN||BYM_NO  LIKE '%'||:dt||'%'", nativeQuery = true)
	public List<BayarBKMaster> getByrBKList(String dt);
	
	@Query(value="SELECT * FROM BAYAR_BK_MASTER S WHERE BYM_TAHUN||BYM_BULAN = dt", nativeQuery = true)
	public List<BayarBKMaster> getByrBKListMonth(String dt);

}
