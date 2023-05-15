package com.project.ticket.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "type")

public class Type {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idType;
	private Boolean statutType;
	private String codeType;
	private String libelleType;

}
