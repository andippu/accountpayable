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
@Table(name = "HUTANG_DAGANG_VALAS")
public class ReportHutangdagangValas {
	 @Id
	 @Column(name="NOUR",  nullable = false)
	 private BigDecimal hdgvId;
	 
	 @Column(name="HD_SPL_ID")
	 private Integer hdgvSplCode;
	 
	 @Column(name="KURS_CODE", length=10)
	 private String hdgvKursCode;
	
	 @Column(name="TANGGAL")
	 private Date hdgvDate;

	 @Column(name="NO_BUKTI", length=100)
	 private String hdgvNoBukti;
	 
	 @Column(name="KETERANGAN", length=300)
	 private String hdgvKeterangan;
	
	 @Column(name="DEBET")
	 private BigDecimal hdgvDebet;
	 
	 @Column(name="KREDIT")
	 private BigDecimal hdgvCredit;
	 
	 @Column(name="SALDO")
	 private BigDecimal hdgvSaldo;
	 
	 @Column(name="RETUR")
	 private BigDecimal hdgvRetur;
	
	 @Column(name="PERIODE", length=6)
	 private String hdgvPeriode;
	 
	 @Column(name="NO_ACC", length=30)
	 private String hdgvNoAcc;
	 
	 @Column(name="STATUS", length=1)
	 private String hdgvStatus;
	 
	 @Column(name="ST", length=1)
	 private String hdgvSt;
	 
	 @Column(name="NO_TTB", length=100)
	 private String hdgvTtbt;
	


}
