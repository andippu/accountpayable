package com.ap.accountpayable.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;                     
import jakarta.persistence.Entity;                     
import jakarta.persistence.Id;                         
import jakarta.persistence.IdClass;                    
import jakarta.persistence.Table;                      
import lombok.AllArgsConstructor;                      
import lombok.Data;                                    
import lombok.NoArgsConstructor;                       
                                                       
@Data                                                  
@NoArgsConstructor                                     
@AllArgsConstructor                                    
@Entity                                                
@Table(name = "T_UPLOAD_PEMBELIAN")                    
@IdClass(TUploadPembelianCompKey.class)                
public class TUploadPembelian {                        
	                                                      
	 @Id                                                  
	 @Column(name="NO_TTB",length=30,  nullable = false)  
	 private String tublNoTtb;                            
	                                                      
	 @Id                                                  
	 @Column(name="KD_BAHAN",length=10,  nullable = false)
	 private String tublKdBahan;                          
	                                                      
	 @Column(name="NO_PO",length=30)                      
	 private String tublNoPo;                             
	                                                      
	 @Column(name="TGL_TTB",length=20)                    
	 private String tublTglTtb;                           
	                                                      
	 @Column(name="JNS_BAHAN",length=5)                   
	 private String tublJnsBhn;                           
	                                                      
	 @Column(name="ERR")                                  
	 private String tublError;                            
	                                                      
	 @Column(name="UNIT_PO",length=10)                    
	 private String tublUnitPo;                           
	                                                      
	 @Column(name="UNIT_TTB",length=10)                   
	 private String tublUnitTtb;                          
	                                                      
	 @Column(name="NO_PP",length=30)                      
	 private String tublNoPp;                             
	                                                      
	 @Column(name="SPL_CODE",length=20)                   
	 private String tublSplCode;                          
	                                                      
	 @Column(name="SPL_NAME",length=100)                  
	 private String tublSplName;                          
	                                                      
	 @Column(name="QTY_PO")                               
	 private BigDecimal tublQtyPo;                        
	                                                      
	 @Column(name="QTY_TTB")                              
	 private BigDecimal tublQtyTtb;                       
                                                       
}                                                      