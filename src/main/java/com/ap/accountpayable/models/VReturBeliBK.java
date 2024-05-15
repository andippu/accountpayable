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
@Table(name= "V_RETUR_BELI_BK")
@IdClass(VReturBeliBKCompKey.class)
public class VReturBeliBK {
	 @Id
	 @Column(name="VRBK_TTB_NO")
	 private String vretbbkTbbNo;
	 
	 @Id
	 @Column(name="VRBK_NO_PO")
	 private String vretbbkPoNo;
	 
	 @Column(name="VRBK_SPL_CODE")
	 private String vretbbksplcode;
	 
	 @Column(name="VRBK_BAHAN_CODE")
	 private String vretbbkbhncode;
	 
	 @Column(name="VRBK_BAHAN_DESC")
	 private String vretbbkbhndesc;
	 
	 @Column(name="VRBK_QTY")
	 private BigDecimal vretbbkqty;
	 
	 @Column(name="VRBK_KODE_KURS")
	 private String vretbbkkodekurs;
	 
	 @Column(name="VRBK_KURS")
	 private Integer vretbbkkurs;
	 
	 @Column(name="VRBK_TOTAL_KURS")
	 private BigDecimal vretbbkttlkurs;
	 
	 @Column(name="VRBK_TOTAL_RP")
	 private BigDecimal vretbbkttlrp;
	 
	 @Column(name="VRBK_PPN_RP")
	 private BigDecimal vretbbkppnrp;
	 
	 @Column(name="VRBK_GRANT_TOTAL")
	 private BigDecimal vretbbkgranttotal;  

}
