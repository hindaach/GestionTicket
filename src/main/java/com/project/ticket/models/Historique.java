package com.project.ticket.models;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "historique")

public class Historique {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idHist;
	private Boolean descriptionHist;
	private Date dateHist;

}
