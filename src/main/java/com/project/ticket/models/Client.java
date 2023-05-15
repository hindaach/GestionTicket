package com.project.ticket.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "client")

public class Client {
	
	private Integer idCli;
	private String raisonsocialCli;
	private String codeCli;
	private String adresseCli;
	private String telephoneCli;
	private String emailCli;
	private Boolean statutCli ;
}
