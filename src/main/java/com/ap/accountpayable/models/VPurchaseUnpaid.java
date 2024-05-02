package com.ap.accountpayable.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "V_PURCHASE_UNPAID")
@IdClass(VPurchaseUnpaidCompKey.class)
public class VPurchaseUnpaid {
	@Id
	@Column(name="VBYUP_NO_TTB", length=30,nullable=false)
	private String vbyupTtb;
	
	@Id
	@Column(name="VBYUP_NO_PO", length=50,nullable=false)
	private String vbyupPo;
	
	@Column(name="VBYUP_SUPPLIER", length=140,nullable=false)
	 private String vbyupSupplier;
	
	@Column(name="VBYUP_TTB_DATE")
	 private Date vbyupTtbDate;
	
	@Column(name="NO_SJ", length=40,nullable=false)
	 private String vbyupNoSj;
	
	@Column(name="VBYUP_NO_INVOICE", length=40,nullable=false)
	 private String vbyupNoInvoice;
	
	@Column(name="VBYUP_KURS_CODE", length=5,nullable=false)
	 private String vbyupKursCode;
	
	@Column(name="VBYUP_REM_NO", length=50,nullable=false)
	 private String vbyupRemNo;
	
	@Column(name="VBYUP_TOTAL_CURR")
	 private BigDecimal vbyupTotalCurr;
	
	@Column(name="VBYUP_TOTAL_RP")
	 private BigDecimal vbyupTotalRp;
	
	@Column(name="VBYUP_PPN")
	 private BigDecimal vbyupPpn;
	
	@Column(name="VBYUP_GRAND_TOTAL")
	 private BigDecimal vbyuGrandTotal;
	
	@Column(name="VBYUP_PAYMENT")
	 private BigDecimal vbyupPayment;
	
	@Column(name="VBYUP_RETUR")
	 private BigDecimal vbyupRetur;

}
