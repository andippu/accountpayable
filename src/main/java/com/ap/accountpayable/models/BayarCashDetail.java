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
@Table(name= "BAYAR_BK_DETAIL_CS")
public class BayarCashDetail {
	@Id
	@Column (name="BYD_NO")
	private BigDecimal byrdNo;
	
	@Column (name="BYD_BYM_TAHUN", length=4)
	private String byrdBymTahun;
	
	@Column (name="BYD_BYM_BULAN", length=2)
	private String byrdBymBulan;
	
	@Column (name="BYD_BYM_NO", length=5)
	private String byrdBymNo;
	
	@Column (name="BYD_DATE")
	private Date byrdDate;
	
	@Column (name="BYD_SPL_CODE", length=6)
	private String byrdSplCode;
	
	@Column (name="BYD_NO_PO", length=30)
	private String byrdPoNo;
	
	@Column (name="BYD_PO_DATE")
	private Date byrdPoDate;
	
	@Column (name="BYD_AMOUNT")
	private BigDecimal byrdAmount;
	
	@Column (name="BYD_KURS_CODE", length=3)
	private String byrdKursCode;
	
	@Column (name="BYD_RATE")
	private Integer byrdRate;
	
	@Column (name="BYD_AMOUNT_RP")
	private BigDecimal byrdAmountRp;
	
	@Column (name="BYD_DESC", length=200)
	private String byrddesc;
	
	@Column (name="PAYMENT_STATUS", length=1)
	private String byrdPayStatus;
	
	@Column (name="PPN_STATUS", length=1)
	private String byrdPpnStatus;
	
	@Column (name="DPP_STATUS", length=1)
	private String byrdDpnStatus;
	
	@Column (name="DOWNPAYMENT_STATUS", length=1)
	private String byrdDpStatus;
	
	@Column (name="BYD_NO_TTB", length=50)
	private String byrdTtbNo;
	
	@Column (name="BYD_LAIN")
	private BigDecimal byrdLain;
	
	@Column (name="BYD_PPH23")
	private BigDecimal byrdPph23;
	
	@Column (name="BYD_PPH4")
	private BigDecimal byrdPph4;
	
	@Column (name="BYD_BULAT")
	private Integer byrdBulat;
	
	@Column (name="BYD_SELISIH_KURS")
	private Integer byrdselisihKurs;


}
