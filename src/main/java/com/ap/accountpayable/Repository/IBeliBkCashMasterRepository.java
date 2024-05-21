package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.BayarBKMaster;
import com.ap.accountpayable.models.BeliBKMaster;
import com.ap.accountpayable.models.BeliBkCashMaster;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
public interface IBeliBkCashMasterRepository extends JpaRepository<BeliBkCashMaster, BigDecimal>{
	
	@Query(value="SELECT * FROM BELI_BK_MASTER_CS s WHERE s.POSTING = 'N' AND s.SPL_CODE LIKE '%'||:splcode||'%'"
			+ "	AND s.NO_PO LIKE '%'||:nopo||'%' AND s.NO_TTB LIKE '%'||:nottb||'%' AND to_char(TTB_DATE,'Mon dd yyyy') LIKE '%'||:dt||'%' AND TIPE_BARANG IN ('BB','BK')" , nativeQuery = true )
public List<BeliBkCashMaster> getBeliBKCash(String splcode, String nopo, String nottb, String dt);

@Query(value="SELECT * FROM BELI_BK_MASTER_CS s WHERE s.POSTING = 'N' AND s.SPL_CODE LIKE '%'||:splcode||'%'"
		+ "	AND s.NO_PO LIKE '%'||:nopo||'%' AND s.NO_TTB LIKE '%'||:nottb||'%' AND to_char(TTB_DATE,'Mon dd yyyy') LIKE '%'||:dt||'%' AND TIPE_BARANG NOT IN ('BB','BK')", nativeQuery = true )
public List<BeliBkCashMaster> getBeliNotBKCash(String splcode, String nopo, String nottb, String dt);

@Query(value="SELECT * FROM BELI_BK_MASTER_CS s WHERE to_char(TTB_DATE,'yyyy') >= (to_char(sysdate,'yyyy')-5) and SPL_CODE=:spl ORDER BY TTB_DATE DESC, NO_PO,NO_TTB", nativeQuery = true )
public List<BeliBkCashMaster> getRetBeliPoCash(String spl);	

@Query(value="SELECT * FROM BELI_BK_MASTER_CS s WHERE NO_PO=:pono", nativeQuery = true )
public List<BeliBkCashMaster> getRetBeliTtbCash(String pono);	
	
List<BeliBkCashMaster> findByBbmCNoPOAndBbmCNoTtb (String pono, String ttbno);

List<BeliBkCashMaster> findByBbmCId (BigDecimal bbmId);

@Modifying
@Query("update BeliBkCashMaster u set u.bbmCCekFisik = :fisik, u.bbmCBTF = :btf where u.bbmCId = :bbmid")
void updateBBKMCash(@Param(value = "fisik") String fisik, @Param(value = "btf") String btf, @Param(value = "bbmid") BigDecimal bbmid);


}
