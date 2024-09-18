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
	
	@Procedure(procedureName = "GET_EXCEL")
	String getExcel(String bulan, String title);
	
	@Procedure(procedureName = "LAP_UTANG_IDR")
	String getLapHutangIdr(String bulan, String title);
	

}
