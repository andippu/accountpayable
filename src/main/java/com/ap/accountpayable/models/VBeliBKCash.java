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
@Table(name= "V_BELI_BK_CASH")
@IdClass(VBeliBKCashCompKey.class)
public class VBeliBKCash {
	
	@Id
	 @Column(name="VBBKC_TTBNO")
	private String vbbkCTbbNo;
	
	 @Id
	 @Column(name="VBBKC_PONO", length=50)
	private String vbbkCPoNo;
	 
	 @Column(name="VBBKC_TOTAL_RP")
	 private BigDecimal vbbkCTotalRp;
	 
	 @Column(name="VBBKC_TOTAL_PPN")
	 private BigDecimal vbbkCTotalPpn;
	 
	 @Column(name="VBBKC_TOTALALL")
	 private BigDecimal vbbkCTotalAll;
	 	   

}
