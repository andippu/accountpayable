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
@Table(name = "RPT_PEMBELIAN_BELUM_LUNAS")
@IdClass(ReportBeliBelumLunasCompKey.class)
public class ReportBeliBelumLunas {
	
	@Id
	@Column(name="NO_PO",length=40,  nullable = false)
	 private String rbblnNoPo;
	
	@Id
	@Column(name="NO_TTB",length=40)
	 private String rbblnNoTtb;
	
	@Id
	@Column(name="BAHAN",length=300)
	 private String rbblnBahan;
	
	@Id
	@Column(name="TOTAL_BELI")
	 private BigDecimal rbblnTotalBeli;
	
	@Column(name="TGL_TTB",length=10)
	 private String rbblnTglTtb;
	
	@Column(name="SPL_NAME")
	private String rbblnSplName;
	
	@Column(name="KURS_CODE")
	private String rbblnKursName;
	
	@Column(name="NO_CN")
	private String rbblnNoCn;
	
	@Column(name="NO_SJ")
	private String rbblnNoSj;
	
	@Column(name="NO_FAKTUR_PAJAK")
	private String rbblnFakturPjk;
	
	@Column(name="TIPE_BELI")
	private String rbblnTipeBeli;
	
	@Column(name="NO_PELUNASAN_1")
	private String rbblnNoPelunasan;
	
	@Column(name="TGL_LUNAS_1")
	private String rbblnTglLunas;
	
	@Column(name="TIPE_LUNAS_1")
	private String rbblnTipeLunas;
	
	@Column(name="BTF")
	private String rbblnBtf;
	
	@Column(name="NO_PELUNASAN_2")
	private String rbblnNoPelunasan2;
	
	@Column(name="TGL_LUNAS_2")
	private String rbblnTglLunas2;
	
	@Column(name="TIPE_LUNAS_2")
	private String rbblnTipeLunas2;
	
	@Column(name="PPN")
	 private BigDecimal rbblnPpn;
	
	@Column(name="NILAI_BAYAR_1")
	 private BigDecimal rbblnNilaiBayar;
	
	@Column(name="NILAI_BAYAR_2")
	 private BigDecimal rbblnNilaiBayar2;
	
	@Column(name="TOTAL_ALL")
	 private BigDecimal rbblnTotalAll;
	
	
}
