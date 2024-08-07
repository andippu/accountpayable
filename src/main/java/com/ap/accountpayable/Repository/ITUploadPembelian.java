package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.TUploadPembelian;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface ITUploadPembelian  extends JpaRepository<TUploadPembelian, String>{
	
	@Procedure(procedureName ="P_T_UPLOAD_PEMBELIAN")
	public String execuploadbeli(String type);
	
	@Procedure(procedureName ="PROSES_PEMBELIAN")
	public String execProsesBeli();
	
	@Procedure(procedureName ="PROSES_PEMBELIAN_LAIN")
	public String execProsesBeliLain();

	
}
