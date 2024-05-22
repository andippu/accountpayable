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
@Table(name= "BELI_BK_DETAIL_CS")
public class BeliBkCashDetail {
	
	 @Id
	 @Column(name="BBDC_NO")
	 private BigDecimal bbdCNo;
	 
	 @Column(name="NO_PO", length=50)
	 private String bbdCPoNo;
	 
	 @Column(name="TTB_NO", length=50)
	 private String bbdCTtbNo;
	 
	 @Column(name="TTB_DATE", length=50)
	 private Date bbdCTtbDate;
	 
	 @Column(name="NO_INVOICE", length=50)
	 private String bbdCInvNo;
	 
	 @Column(name="NO_FKT_PJK", length=50)
	 private String bbdCFktPjk;
	 
	 @Column(name="BAHAN_CODE", length=12)
	 private String bbdCBhnCode;
	 
	 @Column(name="BAHAN_DESC", length=200)
	 private String bbdCBhnDesc;
	 
	 @Column(name="JENIS_BAHAN", length=2)
	 private String bbdCJenisBhn;
	 
	 @Column(name="QTY")
	 private Integer bbdCQty;
	 
	 @Column(name="PRICE")
	 private BigDecimal bbdCPrice;
	 
	 @Column(name="DISC")
	 private BigDecimal bbdCDisc;
	 
	 @Column(name="TOTAL_KURS")
	 private BigDecimal bbdCTtlKurs;
	 
	 @Column(name="KURS_CODE", length=5)
	 private String bbdCKursCode;
	 
	 @Column(name="KURS")
	 private Integer bbdCKurs;
	 
	 @Column(name="TOTAL_RP")
	 private BigDecimal bbdCTotalRp;
	 
	 @Column(name="PPN_RP")
	 private BigDecimal bbdCPpnRp;
	 
	 @Column(name="GRANT_TOTAL")
	 private BigDecimal bbdCGrantTotal;
	 
	 @Column(name="BIAYA_TMB")
	 private BigDecimal bbdCBiayaTmb;
	 
	 @Column(name="KURS_RATE_BELI")
	 private Integer bbdCKursRateBeli;
	 
	 @Column(name="QTY_PO")
	 private Integer bbdCQtyPo;
	 
	 @Column(name="CEK_FISIK", length=1)
	 private String bbdCCekFisik;
	 
	 @Column(name="POSTING", length=1)
	 private String bbdCPosting;
	 
	 @Column(name="LUNAS", length=1)
	 private String bbdCLunas;
	 
	 @Column(name="CREATED_USER", length=10)
	 private String bbdCCreateUser;
	 
	 @Column(name="UPDATED_BY", length=10)
	 private String bbdUpdateUser;
	 
	 @Column(name="CREATED_DATE")
	 private Date bbdCCreateDate;
	 
	 @Column(name="UPDATED_DATE")
	 private Date bbdCUpdateDate;
	 
	 @Column(name="BTF", length=1)
	 private String bbdCBtf;
	 
	 @Column(name="UNIT", length=10)
	 private String bbdCUnit;
	 
	 @Column(name="TGL_FKT_PJK")
	 private Date bbdCTglFktPjk;
	
	 @Column(name="UNITPO", length=20)
	 private String bbdCUnitPo;
	 
	 @Column(name="TGL_INPUT")
	 private Date bbdCTglInput;
	 
	 @Column(name="KETERANGAN", length=300)
	 private String bbdCKeterangan;

}
