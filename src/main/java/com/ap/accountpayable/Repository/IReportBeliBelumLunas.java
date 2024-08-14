package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.ReportBeliBahanMonthlyOthers;
import com.ap.accountpayable.models.ReportBeliBahanMonthlyOthersCompKey;
import com.ap.accountpayable.models.ReportBeliBelumLunas;
import com.ap.accountpayable.models.ReportBeliBelumLunasCompKey;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
public interface IReportBeliBelumLunas extends JpaRepository<ReportBeliBelumLunas, ReportBeliBelumLunasCompKey> {
	@Procedure(procedureName ="PACK_RPT_BELI_BELUM_LUNAS.ANTARA")
	public String execBlBlLnAntara(String pdate, String pdate2 );
	
	@Procedure(procedureName ="PACK_RPT_BELI_BELUM_LUNAS.BY_INPUT")
	public String execBlBlLnByInput(String pdate, String pdate2 );
	
	@Procedure(procedureName ="PACK_RPT_BELI_BELUM_LUNAS.KECIL_SAMA")
	public String execBlBlLnKecilSama(String pdate, String pdate2 );
}
