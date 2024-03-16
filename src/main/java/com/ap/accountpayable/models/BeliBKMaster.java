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
@Table(name= "BELI_BK_MASTER")
public class BeliBKMaster {
	 @Id
	 @Column(name="BLBKMS_ID")
	 private BigDecimal bbm_id;
	 
	 @Column (name="NO_PO" ,length=50, nullable = false)
	 private String bbmNoPO;
	 
	 @Column (name="NO_TTB" ,length=30, nullable = false)
	 private String bbmNoTtb;
	 
	 @Column (name="SPL_CODE" ,length=6, nullable = false)
	 private String bbmSplCode;
	 
	 @Column (name="TTB_DATE" ,length=6, nullable = false)
	 private Date bbmTtbDate;
	 
	 @Column (name="ACC_NO" ,length=8)
	 private String bbmNoAcc;
	 
	 @Column (name="NO_INVOICE" ,length=25)
	 private String bbmNoInv;
	 
	 @Column (name="TIPE_BELI" ,length=2)
	 private String bbmTipeBeli;
	 
	 @Column (name="TIPE_BARANG" ,length=2)
	 private String bbmTipeBarang;
	 
	 @Column (name="SJ_DATE" )
	 private Date bbmSjDate;
	 
	 @Column (name="MJ_NO_VOUCHER" ,length=14)
	 private String bbmNoVoucher;
	 
	 @Column (name="POSTING" ,length=1)			 
	 private String bbmPosting;
	 
	 @Column (name="NO_SJ" ,length=50)			 
	 private String bbmNoSj;
	 
	 @Column (name="NO_FKT_PJK" ,length=50)			 
	 private String bbmNoFktPjk;
	 
	 @Column (name="CREATED_BY" ,length=10)			 
	 private String bbmCreateBy;
	 
	 @Column (name="CREATED_DATE" )			 
	 private Date bbmCreateDate;
	 
	 @Column (name="UPDATED_BY" ,length=10)			 
	 private String bbmUpdateBy;
	 
	 @Column (name="UPDATED_DATE" )			 
	 private Date bbmUpdateDate;
	 
	 @Column (name="LUNAS",length=1 )			 
	 private String bbmLunas;
	 
	 @Column (name="NO_PP",length=50 )			 
	 private String bbmNoPP;
	 
	 @Column (name="CEK_FISIK",length=1 )			 
	 private String bbmCekFisik;
	 
	 @Column (name="BIAYA_TAMBAHAN",length=1 )			 
	 private BigDecimal bbmBiayaTambahan;
	 
	 @Column (name="BTF",length=1 )			 
	 private String bbmBTF;
	 
	 @Column (name="SPL_NAME",length=200 )			 
	 private String bbmSplName;
	 
	 @Column (name="TGL_FKT_PJK" )			 
	 private Date bbmTglFktPjk;
	 
	 @Column (name="KETERANGAN",length=300 )			 
	 private String bbmKeterangan;
	 
	 @Column (name="PERIOD",length=6 )			 
	 private String bbmPeriod;
	 
	 @Column (name="TGL" )			 
	 private Integer bbmTgl;
	 
	 @Column (name="CREADATE" )			 
	 private Date bbmCreaDate;
	 
	 @Column (name="CHGDATE" )			 
	 private Date bbmChgDate;
}
