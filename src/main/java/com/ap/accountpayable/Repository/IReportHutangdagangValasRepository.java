package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.ReportHutangDagangIdr;
import com.ap.accountpayable.models.ReportHutangdagangValas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportHutangdagangValasRepository extends JpaRepository<ReportHutangdagangValas, BigDecimal>{
	
	@Procedure(procedureName = "HIT_KARTU_VALAS")
	String runHitKartuValas(String bulan);
	
	@Procedure(procedureName = "GET_EXCEL_VALAS")
	String getExcelValas(String bulan, String title);
	
	@Procedure(procedureName = "PROC_CLOSE_HU_VALAS")
	String runCloseHutangUmumValas(String pnys);
	
	@Procedure(procedureName = "HIT_VALAS_LAIN")
	String runHitKartuLainValas(String bulan);
	
	@Procedure(procedureName = "CLOSING_HUTANG_LAIN_VALAS")
	String runCloseHutangLainValas(String pnys);

}
