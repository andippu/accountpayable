package com.ap.accountpayable.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ap.accountpayable.models.BayarBKMaster;
import com.ap.accountpayable.models.BayarBKMasterCompKey;
import com.ap.accountpayable.models.VReturBeliBK;
import com.ap.accountpayable.models.VReturBeliBKCompKey;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface IVReturBeliBK extends JpaRepository<VReturBeliBK,VReturBeliBKCompKey>{

	 public List<VReturBeliBK> findByVretbbksplcode(String spl);
}
