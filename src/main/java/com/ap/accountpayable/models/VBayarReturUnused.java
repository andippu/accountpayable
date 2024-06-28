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
@Table(name= "V_RETURBELI_UNUSED")
public class VBayarReturUnused {
	@Id
	@Column(name="VRBUU_REM_NO", length=50)
	private String vrbuuRemNo;
	
	@Column(name="VRBUU_SPLCODE")
	private Integer vrbuuSplCode;
	
	@Column(name="VRBUU_QTY")
	private Integer vrbuuQty;
	
	@Column(name="VRBUU_AMOUNT")
	private Integer vrbuuAmount;
	

}
