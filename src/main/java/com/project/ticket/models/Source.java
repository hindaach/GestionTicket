package com.project.ticket.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "source")

public class Source {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idSource;
	private Boolean statutSource;
	private String codeSource;
	private String libelleSource;

}
