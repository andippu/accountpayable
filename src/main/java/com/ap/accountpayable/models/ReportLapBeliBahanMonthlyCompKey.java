package com.ap.accountpayable.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReportLapBeliBahanMonthlyCompKey implements Serializable{
	 private String rlbmNoPo;
	 private Date rlbmTtbDate;
}
