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
@Table(name= "BAYAR_RETUR")
public class BayarRetur {
	
	 @Id
	 @Column(name="RJ_NO",length=50, nullable = false)
	 private String byRtNo;
	 
	 @Column(name="BYM_TAHUN", length=4,nullable=false)
	 private String byRtTahun;
	 
	 @Column (name="BYM_BULAN" ,length=2, nullable = false)
	 private String byRtBulan;
	 
	 @Column (name="BYM_NO" ,length=5, nullable = false)
	 private String byRtVoucherNo;
	 
	 @Column (name="TOTAL" )
	 private BigDecimal byRtTotal;
	 
	 @Column (name="SPL_CODE" )
	 private Integer byRtSplCode;	

}
