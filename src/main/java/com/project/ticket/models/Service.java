package com.project.ticket.models;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Table(name = "service")
@Entity

public class Service {

	
			@Id
			@GeneratedValue(strategy= GenerationType.IDENTITY)
			private Integer idService;
			private Boolean statutService;
			private String codeService;
			private String libelleService;
}
