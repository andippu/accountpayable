package com.ap.accountpayable.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReportBeliBelumLunasCompKey implements Serializable{
	 private String rbblnNoPo;
	 private String rbblnNoTtb;
	 private String rbblnBahan;
	 private BigDecimal rbblnTotalBeli;
}
