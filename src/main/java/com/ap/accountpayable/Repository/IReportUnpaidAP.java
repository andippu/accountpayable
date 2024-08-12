package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.ReportUnpaidAP;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public interface IReportUnpaidAP extends JpaRepository<ReportUnpaidAP, String> {
	
	@Procedure(procedureName ="P_RPT_UNPAID_AP")
	public String execUnpaidAp(String pdate, String ptype );
		
}
