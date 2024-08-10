package com.ap.accountpayable.models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RPT_TANDATERIMA_FPAJAK")
public class ReportTandaTerimaFPajak {
	
	@Id
	@Column(name="RTTFP_SUPNAME",length=100)
	 private String rtfpSupName;
	
	@Column(name="RTTFP_NOFAKTUR",length=50)
	 private String rttfpNoFaktur;
	
	@Column(name="RTTFP_PPN")
	 private BigDecimal rttfpPn;
	
	@Column(name="RTTFP_TGLFAK",length=10)
	 private String rttfpTglFak;
	
	@Column(name="RTTFP_PERIOD",length=10)
	 private String rttfpPeriod;
	


}
