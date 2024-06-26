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
@Table(name= "BAYAR_BK_MASTER_CS")
@IdClass(BayarCashMasterCompKey.class)
public class BayarCashMaster {
	
	 @Id
	 @Column(name="BYM_TAHUN", length=4,nullable=false)
	 private String byrCashTahun;
	 
	 @Id
	 @Column (name="BYM_BULAN" ,length=2, nullable = false)
	 private String byrCashBulan;
	 
	 @Id
	 @Column (name="BYM_NO" ,length=5, nullable = false)
	 private String byrCashNo;
	 
	 @Column (name="BYM_NO_VOUCHER" ,length=7)
	 private String byrCashNoVoucher;
	 
	 @Column (name="BYM_AMOUNT" )
	 private BigDecimal byrCashAmount;
	 
	 @Column (name="BYM_DATE" )
	 private Date byrCashDate;
	 
	 @Column (name="BYM_KAS" )
	 private BigDecimal byrCashKas;
	 
	 @Column (name="BYM_GIRO",length=30 )
	 private String byrCashGiro;

	
	 
}
