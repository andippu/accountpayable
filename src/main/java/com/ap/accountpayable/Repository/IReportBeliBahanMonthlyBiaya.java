package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.ReportBeliBahanMonthlyBiaya;
import com.ap.accountpayable.models.ReportLapBeliBahanMonthlyBiayaCompKey;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IReportBeliBahanMonthlyBiaya extends JpaRepository<ReportBeliBahanMonthlyBiaya,ReportLapBeliBahanMonthlyBiayaCompKey>{
	public List<ReportBeliBahanMonthlyBiaya> findByRlbmPeriodMonthOrderByRlbmTtbDate(String period);
}
