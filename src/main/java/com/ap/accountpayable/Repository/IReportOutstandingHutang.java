package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.ReportOutstandingHutang;
import com.ap.accountpayable.models.ReportOutstandingHutangCompKey;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public interface IReportOutstandingHutang extends JpaRepository<ReportOutstandingHutang,ReportOutstandingHutangCompKey> {
	
	public List<ReportOutstandingHutang> findByRoshSplCodeAndRoshTtbDateBetween(String splcode, String pdate1, String pdate2);

}
