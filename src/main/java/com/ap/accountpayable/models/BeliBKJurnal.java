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
@Table(name= "BELI_BK_JURNAL")
public class BeliBKJurnal {

	@Id
   @Column(name="NO_BBJ")
	private BigDecimal bbjNo;
	
	 @Column(name="NO_TTB")
		private String bbjTbbNo;
		
	 @Id
	 @Column(name="NO_PO", length=50)
	private String bbjPoNo;
	 
	 @Column(name="NO_ACC", length=7)
		private String bbjAccNo;
	 
	 @Column(name="AMOUNT")
		private BigDecimal bbjAmount;
	
	 @Column(name="ACCOUNT_LAWAN", length=7)
		private String bbjAccNoLawan;
	 
	 @Column(name="CREADATE")
		private Date bbjCreateDate;
	 
	 @Column(name="CHGDATE")
		private Date bbjChangeDate;

	
}
