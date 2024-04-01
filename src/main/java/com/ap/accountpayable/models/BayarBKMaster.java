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
@Table(name= "BAYAR_BK_MASTER")
@IdClass(BayarBKMasterCompKey.class)
public class BayarBKMaster {
	 @Id
	 @Column(name="BYM_TAHUN", length=4,nullable=false)
	 private String byrTahun;
	 
	 @Id
	 @Column (name="BYM_BULAN" ,length=2, nullable = false)
	 private String byrBulan;
	 
	 @Id
	 @Column (name="BYM_NO" ,length=5, nullable = false)
	 private String byrNo;
	 
	 @Column (name="BYM_NO_VOUCHER" ,length=7)
	 private String byrNoVoucher;
	 
	 @Column (name="BYM_AMOUNT" )
	 private BigDecimal byrAmount;
	 
	 @Column (name="BYM_DATE" )
	 private Date byrDate;
	 
	 @Column (name="BYM_KAS" )
	 private BigDecimal byrKas;
	 
	 @Column (name="BYM_GIRO",length=30 )
	 private String byrGiro;
	 
}
