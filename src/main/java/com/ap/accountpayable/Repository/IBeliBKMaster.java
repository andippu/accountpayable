package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.BeliBKMaster;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IBeliBKMaster extends JpaRepository<BeliBKMaster, BigDecimal> {
	
	//@Query(value="SELECT s FROM BeliBKMaster s WHERE s.bbmPosting = 'N' AND s.bbmSplCode LIKE %:splcode% "
		//	+ "	AND s.bbmNoPO LIKE %:nopo% AND s.bbmNoTtb LIKE %:nottb% AND to_char(SUSUT_TGL_PEROLEHAN,'Mon dd yyyy') LIKE %dt% " )
	@Query(value="SELECT * FROM BELI_BK_MASTER s WHERE s.POSTING = 'N' AND s.SPL_CODE LIKE '%'||:splcode||'%'"
				+ "	AND s.NO_PO LIKE '%'||:nopo||'%' AND s.NO_TTB LIKE '%'||:nottb||'%' AND to_char(TTB_DATE,'Mon dd yyyy') LIKE '%'||:dt||'%' AND TIPE_BARANG IN ('BB','BK')" , nativeQuery = true )
	public List<BeliBKMaster> getBeliBK(String splcode, String nopo, String nottb, String dt);
	
	@Query(value="SELECT * FROM BELI_BK_MASTER s WHERE s.POSTING = 'N' AND s.SPL_CODE LIKE '%'||:splcode||'%'"
			+ "	AND s.NO_PO LIKE '%'||:nopo||'%' AND s.NO_TTB LIKE '%'||:nottb||'%' AND to_char(TTB_DATE,'Mon dd yyyy') LIKE '%'||:dt||'%' AND TIPE_BARANG NOT IN ('BB','BK')", nativeQuery = true )
	public List<BeliBKMaster> getBeliNotBK(String splcode, String nopo, String nottb, String dt);
	
	@Query(value="SELECT * FROM BELI_BK_MASTER s WHERE to_char(TTB_DATE,'yyyy') >= (to_char(sysdate,'yyyy')-1) and SPL_CODE=:spl ORDER BY TTB_DATE DESC, NO_PO,NO_TTB", nativeQuery = true )
	public List<BeliBKMaster> getRetBeliPo(String spl);	
	
	@Query(value="SELECT * FROM BELI_BK_MASTER s WHERE NO_PO=:pono", nativeQuery = true )
	public List<BeliBKMaster> getRetBeliTtb(String pono);	
		
	List<BeliBKMaster> findByBbmNoPOAndBbmNoTtb (String pono, String ttbno);
	
	List<BeliBKMaster> findByBbmId (BigDecimal bbmId);
	
	@Modifying
	@Query("update BeliBKMaster u set u.bbmCekFisik = :fisik, u.bbmBTF = :btf where u.bbmId = :bbmid")
	void updateBBKM(@Param(value = "fisik") String fisik, @Param(value = "btf") String btf, @Param(value = "bbmid") BigDecimal bbmid);
	


}
