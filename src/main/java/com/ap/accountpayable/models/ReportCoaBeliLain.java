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
@Table(name= "RPT_COA_PEMBELIAN_LAIN")
public class ReportCoaBeliLain {
	
	@Id
	@Column(name="IDS",length=40,  nullable = false)
	 private BigDecimal rcbllnIds;
	
	@Column(name="SUPPLIER")
	 private String rcbllnSupplier;
	
	@Column(name="TGLTTB")
	 private String rcbllnTglTtb;
	
	@Column(name="NOPO")
	 private String rcbllnNoPo;
	
	@Column(name="NOPP")
	 private String rcbllnNoPp;
	
	@Column(name="NO_ACC")
	 private String rcbllnNoAcc;
	
	@Column(name="NO_ACC_LAWAN")
	 private String rcbllnNoAccLawan;
	
	@Column(name="BAHAN")
	 private String rcbllnBahan;
	
	@Column(name="DESCS")
	 private String rcbllnDesc;
	
	@Column(name="FISIK")
	 private String rcbllnFisik;
	
	@Column(name="AMOUNT")
	 private BigDecimal rcbllnAmount;
	
	@Column(name="QTY")
	 private BigDecimal rcbllnQty;
	
	@Column(name="HRG")
	 private BigDecimal rcbllnHarga;
	
	@Column(name="TOTAL_RP")
	 private BigDecimal rcbllnTotalRp;
	
}
