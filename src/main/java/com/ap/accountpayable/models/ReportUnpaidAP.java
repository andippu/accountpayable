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

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RPT_UNPAID_MAIN")
public class ReportUnpaidAP {
	
	@Id
	@Column(name="RUPAP_NO_PO", length=40)
	private String rupapNoPo;
	
	@Column(name="RUPAP_SUP_NAME",length=100)
	 private String rupapSupName;
}
