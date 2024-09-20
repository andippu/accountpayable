package com.ap.accountpayable.models;

import java.util.Date;
import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "KURS")
public class Kurs {
	
	 @Id
	 @Column (name="KURS_CODE" ,length=2, nullable = false)
	 private String kursCode;
	 
	
	 @Column (name="KURS_DESC" ,length=20, nullable = false)
	 private String kursDesc;
	

}
