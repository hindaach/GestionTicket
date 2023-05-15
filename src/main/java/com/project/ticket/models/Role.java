package com.project.ticket.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "role")
public class Role {
	private Integer idRole;
	private String codeRole;
	private String libelleRole;
	private Boolean statutRole ;
	
}
