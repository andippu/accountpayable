package com.ap.accountpayable.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name= "BELI_BK_MASTER_CS")
public class BeliBkCashMaster {
	
	 @Id
	 @Column(name="BLBKMSC_ID")
	 private BigDecimal bbmCId;
	 
	 @Column (name="NO_PO" ,length=50, nullable = false)
	 private String bbmCNoPO;
	 
	 @Column (name="NO_TTB" ,length=30, nullable = false)
	 private String bbmCNoTtb;
	 
	 @Column (name="SPL_CODE" ,length=6, nullable = false)
	 private String bbmCSplCode;
	 
	 @Column (name="TTB_DATE" ,length=6, nullable = false)
	 private Date bbmCTtbDate;
	 
	 @Column (name="ACC_NO" ,length=8)
	 private String bbmCNoAcc;
	 
	 @Column (name="NO_INVOICE" ,length=25)
	 private String bbmCNoInv;
	 
	 @Column (name="TIPE_BELI" ,length=2)
	 private String bbmCTipeBeli;
	 
	 @Column (name="TIPE_BARANG" ,length=2)
	 private String bbmCTipeBarang;
	 
	 @Column (name="SJ_DATE" )
	 private Date bbmCSjDate;
	 
	 @Column (name="MJ_NO_VOUCHER" ,length=14)
	 private String bbmCNoVoucher;
	 
	 @Column (name="POSTING" ,length=1)			 
	 private String bbmCPosting;
	 
	 @Column (name="NO_SJ" ,length=50)			 
	 private String bbmCNoSj;
	 
	 @Column (name="NO_FKT_PJK" ,length=50)			 
	 private String bbmCNoFktPjk;
	 
	 @Column (name="CREATED_BY" ,length=10)			 
	 private String bbmCCreateBy;
	 
	 @Column (name="CREATED_DATE" )			 
	 private Date bbmCCreateDate;
	 
	 @Column (name="UPDATED_BY" ,length=10)			 
	 private String bbmCUpdateBy;
	 
	 @Column (name="UPDATED_DATE" )			 
	 private Date bbmCUpdateDate;
	 
	 @Column (name="LUNAS",length=1 )			 
	 private String bbmCLunas;
	 
	 @Column (name="NO_PP",length=50 )			 
	 private String bbmCNoPP;
	 
	 @Column (name="CEK_FISIK",length=1 )			 
	 private String bbmCCekFisik;
	 
	 @Column (name="BIAYA_TAMBAHAN",length=1 )			 
	 private BigDecimal bbmCBiayaTambahan;
	 
	 @Column (name="BTF",length=1 )			 
	 private String bbmCBTF;
	 
	 @Column (name="SPL_NAME",length=200 )			 
	 private String bbmCSplName;
	 
	 @Column (name="TGL_FKT_PJK" )			 
	 private Date bbmCTglFktPjk;
	 
	 @Column (name="KETERANGAN",length=300 )			 
	 private String bbmCKeterangan;
	 
	 @Column (name="PERIOD",length=6 )			 
	 private String bbmCPeriod;
	 
	 @Column (name="TGL" )			 
	 private Integer bbmTgl;
	 
}
