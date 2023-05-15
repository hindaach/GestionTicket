package com.project.ticket.models;

import lombok.Data;



//import com.project.ticket.models.Role;
import jakarta.persistence.*;

@Data
@Table(name = "user")
@Entity

public class User {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idUti;
	private String firstnameUti;
	private String lastnameUti;
	private String adresseUti;
	private Boolean statutUti ;
	private String telephoneUti;
	private String emailUti;
	private String codeUti;
	private String libelleUti;
	private String loginUti;
	private String passwordUti;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Role role;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Client client;
}
