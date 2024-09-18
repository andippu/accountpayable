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
@Table(name = "HUTANG_DAGANG_IDR")
public class ReportHutangDagangIdr {
	
	 @Id
	 @Column(name="NOUR",  nullable = false)
	 private BigDecimal hdgiId;
	 
	 @Column(name="HD_SPL_ID")
	 private BigDecimal hdgiSplCode;
	 
	 @Column(name="KURS_CODE", length=10)
	 private String hdgiKursCode;
	
	 @Column(name="TANGGAL")
	 private Date hdgiDate;
	 
	 @Column(name="NO_BUKTI", length=100)
	 private String hdgiNoBukti;
	 
	 @Column(name="KETERANGAN", length=300)
	 private String hdgiKeterangan;
	 	 
	 @Column(name="Debet")
	 private BigDecimal hdgiDebet;
	 
	 @Column(name="KREDIT")
	 private BigDecimal hdgiCredit;
	 
	 @Column(name="SALDO")
	 private BigDecimal hdgiSaldo;
	 
	 @Column(name="RETUR")
	 private BigDecimal hdgiRetur;
	
	 @Column(name="PERIODE", length=6)
	 private String hdgiPeriode;
	 
	 @Column(name="NO_ACC", length=30)
	 private String hdgiNoAcc;
	 

}
