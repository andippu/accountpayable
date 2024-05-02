package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.BayarBKMaster;
import com.ap.accountpayable.models.BayarBKMasterCompKey;
import com.ap.accountpayable.models.VPurchaseUnpaid;
import com.ap.accountpayable.models.VPurchaseUnpaidCompKey;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")

public interface IPurchaseUnpaid extends JpaRepository<VPurchaseUnpaid,VPurchaseUnpaidCompKey> {
	
	List<VPurchaseUnpaid> findByVbyupTtbAndVbyupPo(String ttbno, String pono);
	
	List<VPurchaseUnpaid> findByVbyupSupplier(String supdesc);
	
	//@Query(value="SELECT * FROM V_PURCHASE_UNPAID s WHERE VBYUP_SUPPLIER like '%'||:sd||'%'",nativeQuery = true)
	//List<VPurchaseUnpaid> getListUnpaid(String sd);

}
