package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.BayarRetur;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
public interface IBayarReturRepository extends JpaRepository<BayarRetur,String> {
	public List<BayarRetur> findByByRtTahunAndByRtBulanAndByRtVoucherNoAndByRtSplCode(String thn, String bln, String No, Integer spl );
    
	@Procedure(procedureName ="P_UPDATE_USE_BAYARRETUR")
	public String execJurnalBayarBeli(String p_trans, String p_remno);
}
