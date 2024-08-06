package com.ap.accountpayable.models;

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
@Table(name = "RPT_LAP_BELIBAHAN_MONOTHER")
@IdClass(ReportBeliBahanMonthlyOthersCompKey.class)
public class ReportBeliBahanMonthlyOthers {
	@Id
	@Column(name="RLBM_NOPO",length=50,  nullable = false)
	 private String rlbmNoPo;
	
	@Id
	@Column(name="RLBM_TTBDATE")
	private Date rlbmTtbDate;
	
	@Column(name="RLBM_TRANSTYPE",length=21)
	 private String rlbmTransType;
	
	@Column(name="RLBM_SPL_NAME",length=100)
	 private String rlbmSplName;
	
	@Column(name="RLBM_DATE",length=10)
	 private String rlbmDate;
	
	@Column(name="RLBM_NOPAJAK",length=50)
	 private String rlbmNoPajak;
	
	@Column(name="RLBM_BDESC",length=200)
	 private String rlbmDesc;
	
	@Column(name="RLBM_ACCNO",length=8)
	 private String rlbmAccNo;
	
	@Column(name="RLBM_BTF",length=8)
	 private String rlbmBtf;
	
	@Column(name="RLBM_PERIODMON",length=8)
	 private String rlbmPeriodMonth;
	
	@Column(name="RLBM_QTY")
	 private BigDecimal rlbmQty;
	
	@Column(name="RLBM_PRICE")
	 private BigDecimal rlbmPrice;	

	@Column(name="RLBM_TOTALRP")
	 private BigDecimal rlbmTotalRp;	

	@Column(name="RLBM_PPNRP")
	 private BigDecimal rlbmPpnRp;
	
	@Column(name="RLBM_GRANTTOTAL")
	 private BigDecimal rlbmGrantTotal;
	
	@Column(name="RLBM_KENAPPN")
	 private BigDecimal rlbmKenaPpn;	
}


