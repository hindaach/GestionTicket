package com.project.ticket.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "etat")

public class Etat {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idEtat;
	private Boolean statutEtat;

}

