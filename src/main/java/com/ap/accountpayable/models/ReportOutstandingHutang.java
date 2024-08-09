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
@Table(name = "RPT_OUTSTANDING_HUTANG")
@IdClass(ReportOutstandingHutangCompKey.class)
public class ReportOutstandingHutang {
	
	@Id
	@Column(name="ROSH_NOPO",length=50,  nullable = false)
	 private String roshNoPO;

	@Id
	@Column(name="ROSH_NOTTB",length=50,  nullable = false)
	 private String roshNoTtb;
	
	@Id
	@Column(name="ROSH_TTBDATE",length=10)
	 private String roshTtbDate;
	
	@Column(name="ROSH_BYDDATE",length=10)
	 private String roshBydDate;

	
	@Column(name="ROSH_VPK",length=14)
	 private String roshNoVpk;
	
	@Column(name="ROSH_SPLCODE",length=6)
	 private String roshSplCode;
	
	@Column(name="ROSH_NOINVOICE",length=50)
	 private String roshNoInvoice;
	
	@Column(name="ROSH_PRICE")
	 private BigDecimal roshPrice;

	@Column(name="ROSH_KURSCODE",length=3)
	 private String roshKursCode;

	@Column(name="ROSH_KURS")
	 private BigDecimal roshKurs;
	
	@Column(name="ROSH_TOTALKURS")
	 private BigDecimal roshTotalKurs;
	
	@Column(name="ROSH_TOTALRP")
	 private BigDecimal roshTotalRp;
	
	@Column(name="ROSH_PPNRP")
	 private BigDecimal roshPpnRp;
	
	@Column(name="ROSH_GRANTOTAL")
	 private BigDecimal roshGrandTotal;
	
	@Column(name="ROSH_SUPPLIER",length=142)
	 private String roshSupplier;

	@Column(name="ROSH_AMOUNTRP")
	 private BigDecimal roshAmountRp;
	
	@Column(name="ROSH_STATUS",length=3)
	 private String roshStatus;
	   
}
