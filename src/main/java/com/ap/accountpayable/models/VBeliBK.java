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
@Table(name= "V_BELI_BK")
@IdClass(VBeliBKCompKey.class)
public class VBeliBK {
	 @Id
	 @Column(name="VBBK_TTBNO")
	 private String vbbkTbbNo;
	 
	 @Id
	 @Column(name="VBBK_PONO", length=50)
	 private String vbbkPoNo;
	 
	 @Column(name="VBBK_TOTAL_RP")
	 private BigDecimal vbbkTotalRp;
	 
	 @Column(name="VBBK_TOTAL_PPN")
	 private BigDecimal vbbkTotalPpn;
	 
	 @Column(name="VBBK_TOTALALL")
	 private BigDecimal vbbkTotalAll;
}
