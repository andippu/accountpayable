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
@Table(name= "RETUR_BELI_DETAIL")
@IdClass(ReturBeliDetailCompKey.class)
public class ReturBeliDetail {
	
	@Id
	@Column(name="REM_NO", length=50,nullable=false)
	private String rtBlDtlNo;
	 
	@Id
	@Column(name="KODE_BAHAN", length=50,nullable=false)
	private String rtBlDtlKdBhn;
	
	@Column(name="REM_NO_PO", length=50,nullable=false)
	private String rtBlDtlNoPO;
	
	@Column(name="REM_NO_TTB", length=50,nullable=false)
	private String rtBlDtlNoTtbn;
	
	@Column(name="JENIS_BAHAN", length=2)
	private String rtBlDtlJnsBhn;
	
	@Column(name="KURS_CODE", length=5)
	private String rtBlDtlKursCode;
    
	@Column(name="QTY")
	private Integer rtBlDtlQty;
	
	@Column(name="HRG_SAT")
	private BigDecimal rtBlDtlHrgSat;
	
	@Column(name="TOTAL_KURS")
	private BigDecimal rtBlDtlTotalKurs;
	
	@Column(name="RATE")
	private BigDecimal rtBlDtlRate;
	
	@Column(name="TOTAL_RP")
	private BigDecimal rtBlDtlTotalRp;
	
	@Column(name="PPN")
	private BigDecimal rtBlDtlPpn;
	
	@Column(name="SELISIH_KURS")
	private BigDecimal rtBlDtlSelKurs;
	
	@Column(name="RATE_BELI")
	private BigDecimal rtBlDtlRateBeli;
	
	@Column(name="TOTAL_RP_BELI")
	private BigDecimal rtBlDtlTotalRpBeli;
	
	@Column(name="PAYMENT_STATUS")
	private Integer rtBlDtlPaymentSts;
	
	 @Column (name="TTB_DATE" )
	 private Date rtBlDtlTtbDate;
	 
	 @Column(name="FKT_PAJAK", length=30)
	 private String rtBlDtlFktPjk;
	 
	 @Column (name="TGL_PJK" )
	 private Date rtBlDtlTglPjk;
	 
	 @Column(name="USED", length=1)
	 private String rtBlDtlUsed;
	 
	 @Column(name="PERSEN_PPN_AWAL")
	 private BigDecimal rtBlDtlPersenPpnAwal;
	
}
