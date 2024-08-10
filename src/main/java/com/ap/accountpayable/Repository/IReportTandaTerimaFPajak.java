package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.ReportTandaTerimaFPajak;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public interface IReportTandaTerimaFPajak extends JpaRepository<ReportTandaTerimaFPajak, String> {

	public List<ReportTandaTerimaFPajak> findByRttfpPeriod(String period);
}
