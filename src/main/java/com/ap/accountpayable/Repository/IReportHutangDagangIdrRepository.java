package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.ReportHutangDagangIdr;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportHutangDagangIdrRepository extends JpaRepository<ReportHutangDagangIdr, BigDecimal> {
	
	@Procedure(procedureName = "HIT_KARTU")
	String runHitKartu(String bulan);
	
	@Procedure(procedureName = "HIT_KARTU_LAIN")
	String runHitKartuLain(String bulan);
	
	@Procedure(procedureName = "HIT_KARTU_BIAYA")
	String runHitKartuBiaya(String bulan);
	
	@Procedure(procedureName = "GET_EXCEL")
	String getExcel(String bulan, String title);
	
	@Procedure(procedureName = "LAP_UTANG_IDR")
	String getLapHutangIdr(String bulan, String title);
	
	@Procedure(procedureName = "CLOSING_HUTANG_UMUM_IDR")
	String runCloseHutangUmumIdr(String pnys);
	
	@Procedure(procedureName = "CLOSING_HUTANG_LAIN_IDR")
	String runCloseHutangLainIdr(String pnys);
	
	@Procedure(procedureName = "CLOSING_HUTANG_BIAYA_IDR")
	String runCloseHutangBiayaIdr(String pnys);
	
	@Procedure(procedureName = "POSTING_JURNAL_UMUM_IDR")
	String runPostHutangUmuIdr(String bulan);
	
	@Procedure(procedureName = "POSTING_JURNAL_LAIN_IDR")
	String runPostHutangLainIdr(String bulan);
	
	@Procedure(procedureName = "POSTING_JURNAL_BIAYA_IDR")
	String runPostHutangBiayaIdr(String bulan);
	

}
