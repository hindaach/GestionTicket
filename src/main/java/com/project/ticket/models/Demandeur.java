package com.project.ticket.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "demandeur")
@Entity

public class Demandeur {
	
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Integer idDem;
		private String firstnameDem;
		private String lastnameDem;
		private String adresseDem;
		private Boolean statutDem;
		private String telephoneDem;
		private String emailDem;
		private String codeDem;
		private String libelleDem;
		
}
