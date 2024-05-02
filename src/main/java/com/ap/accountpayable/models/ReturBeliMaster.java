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
@Table(name= "RETUR_BELI_MASTER")
public class ReturBeliMaster {
	
	 @Id
	 @Column(name="REM_NO", length=50,nullable=false)
	 private String rtBlNo;
	 
	 @Column (name="REM_DATE" )
	 private Date rtBlDate;
	 
	 @Column (name="REM_SPL_ID" )
	 private Integer rtBlSplCode;
	 
	 @Column (name="REM_COMPLAIN_DATE" )
	 private Date rtBlComplainDate;
	 
	 @Column(name="REM_COMPLAIN_NO", length=50)
	 private String rtBlComplainNo;

}
