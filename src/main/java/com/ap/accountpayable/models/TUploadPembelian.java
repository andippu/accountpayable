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
	 @Column(name="NO_TTB",length=50,  nullable = false)  
	 private String tublNoTtb;                            
	                                                      
	 @Id                                                  
	 @Column(name="KD_BAHAN",length=10,  nullable = false)
	 private String tublKdBahan;                          
	                                                      
	 @Column(name="NO_PO",length=50)                      
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
	                                                      
	 @Column(name="QTY_PO",length=20)                               
	 private String tublQtyPo;                        
	                                                      
	 @Column(name="QTY_TTB",length=20)                              
	 private String tublQtyTtb;   
	 
	 @Column(name="NO_SURAT_JALAN",length=30)                  
	 private String tublSuratjln;     
	 
	 @Column(name="MATA_UANG",length=30)                  
	 private String tublMataUang;   
	 
	 @Column(name="HARGA_SATUAN",length=20)                              
	 private String tublHrgSatuan;   
	 
	 @Column(name="PPN",length=20)                              
	 private String tublPpn;   
	 
	 @Column(name="TOP",length=30)                              
	 private String tublTop; 
	 
	 @Column(name="PO_SEQID",length=20)                              
	 private String tublPoSeId; 
	 
	 @Column(name="NAMA_BAHAN",length=100)                              
	 private String tublNamaBahan; 
	 
	 @Column(name="DESKRIPSI",length=200)                              
	 private String tublDeskripsi; 
	 	 
                                                       
}                                                      