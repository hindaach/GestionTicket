package com.project.ticket.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "priorite")
@Entity

public class Priorite {

	
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Integer idUti;
		private Boolean statutPri;
		private String codePri;
		private String libellePri;

}
