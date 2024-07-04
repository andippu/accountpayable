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
@Table(name= "BELI_BK_DETAIL")
public class BeliBKDetail {
	
	 @Id
	 @Column(name="NO_BBD")
	 private BigDecimal bbdNo;
	 
	 
	 @Column(name="NO_PO", length=50)
	 private String bbdPoNo;
	 
	 @Column(name="TTB_NO", length=50)
	 private String bbdTtbNo;
	 
	 @Column(name="TTB_DATE", length=50)
	 private Date bbdTtbDate;
	 
	 @Column(name="NO_INVOICE", length=50)
	 private String bbdInvNo;
	 
	 @Column(name="NO_FKT_PJK", length=50)
	 private String bbdFktPjk;
	 
	 @Column(name="BAHAN_CODE", length=12)
	 private String bbdBhnCode;
	 
	 @Column(name="BAHAN_DESC", length=200)
	 private String bbdBhnDesc;
	 
	 @Column(name="JENIS_BAHAN", length=2)
	 private String bbdJenisBhn;
	 
	 @Column(name="QTY")
	 private Integer bbdQty;
	 
	 @Column(name="PRICE")
	 private BigDecimal bbdPrice;
	 
	 @Column(name="DISC")
	 private BigDecimal bbdDisc;
	 
	 @Column(name="TOTAL_KURS")
	 private BigDecimal bbdTtlKurs;
	 
	 @Column(name="KURS_CODE", length=5)
	 private String bbdKursCode;
	 
	 @Column(name="KURS")
	 private Integer bbdKurs;
	 
	 @Column(name="TOTAL_RP")
	 private BigDecimal bbdTotalRp;
	 
	 @Column(name="PPN_RP")
	 private BigDecimal bbdPpnRp;
	 
	 @Column(name="GRANT_TOTAL")
	 private BigDecimal bbdGrantTotal;
	 
	 @Column(name="BIAYA_TMB")
	 private BigDecimal bbdBiayaTmb;
	 
	 @Column(name="KURS_RATE_BELI")
	 private Integer bbdKursRateBeli;
	 
	 @Column(name="QTY_PO")
	 private Integer bbdQtyPo;
	 
	 @Column(name="CEK_FISIK", length=1)
	 private String bbdCekFisik;
	 
	 @Column(name="POSTING", length=1)
	 private String bbdPosting;
	 
	 @Column(name="LUNAS", length=1)
	 private String bbdLunas;
	 
	 @Column(name="CREATED_USER", length=10)
	 private String bbdCreateUser;
	 
	 @Column(name="UPDATED_BY", length=10)
	 private String bbdUpdateUser;
	 
	 @Column(name="CREATED_DATE")
	 private Date bbdCreateDate;
	 
	 @Column(name="UPDATED_DATE")
	 private Date bbdUpdateDate;
	 
	 @Column(name="BTF", length=1)
	 private String bbdBtf;
	 
	 @Column(name="UNIT", length=10)
	 private String bbdUnit;
	 
	 @Column(name="TGL_FKT_PJK")
	 private Date bbdTglFktPjk;
	
	 @Column(name="UNITPO", length=20)
	 private String bbdUnitPo;
	 
	 @Column(name="TGL_INPUT")
	 private Date bbdTglInput;
	 
	 @Column(name="KETERANGAN", length=300)
	 private String bbdKeterangan;
	 
	 @Column(name="CHGDATE")
	 private Date bbdChgDate;
	 
	 @Column(name="CREADATE")
	 private Date bbdCreaDate;	 
	        
}
