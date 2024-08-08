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
@Table(name = "LAP_AP_INFO_MAIN")
@IdClass(ReportApInfoCompKey.class)
public class ReportApInfo {
 
	@Id
	@Column(name="LAIM_PONO",length=50,  nullable = false)
	 private String rlaimNoPo;
	
	@Id
	@Column(name="LAIM_TTBNO",length=50,  nullable = false)
	 private String rlaimNottb;
	
	@Id
	@Column(name="LAIM_BBCODE", length=12)
	private String rlaimBbCode;
	
	@Column(name="LAIM_DATE", length=10)
	private String rlaimDate;
	
	@Column(name="LAIM_INVOICE", length=25)
	private String rlaimInvoice;
	
	@Column(name="LAIM_FKT_PJK", length=50)
	private String rlaimNoPjk;
	
	@Column(name="LAIM_BAHANDESC", length=200)
	private String rlaimBbDesc;
	
	@Column(name="LAIM_JENISBAHAN", length=2)
	private String rlaimJenisBahan;
	
	@Column(name="LAIM_QTY", length=62)
	private String rlaimQty;
	
	@Column(name="LAIM_SUPPLIER", length=62)
	private String rlaimSupplier;


}
