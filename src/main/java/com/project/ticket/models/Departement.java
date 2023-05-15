package com.project.ticket.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "departement")

public class Departement {
	private Integer idDep;
	private String libelleDep;
	private String nameDep;
	private String codeDep;
	private Boolean statutDep;
	
}
