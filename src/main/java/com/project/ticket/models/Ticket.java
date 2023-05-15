package com.project.ticket.models;



import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "ticket")
@Entity

public class Ticket {
	
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Integer idTick;
		private String titreTick;
		private String codeTick;
		private String libelleTick;
		private Boolean statutTick ;
		private Date datecreationTick;
		private Date dateaffectationTick;
		private Date datesolutionTick;
		private Long descriptionTick;
		private Long textTick;
		@ManyToOne(cascade = CascadeType.PERSIST)
		private Priorite priorite;
		@ManyToOne(cascade = CascadeType.PERSIST)
		private User user;
		@ManyToOne(cascade = CascadeType.PERSIST)
		private Departement departement;
		@ManyToOne(cascade = CascadeType.PERSIST)
		private Etat etat;
		@ManyToOne(cascade = CascadeType.PERSIST)
		private Source source;
		@ManyToOne(cascade = CascadeType.PERSIST)
		private Historique historique;
		@ManyToOne(cascade = CascadeType.PERSIST)
		private Type type;
		

}
