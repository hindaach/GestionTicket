package com.project.ticket.services;

import java.util.List;

import com.project.ticket.models.Ticket;



public interface TicketService {


	void ajouter(Ticket ticket);
	
	void supprimer(int idTic);

	void modifier(Ticket ticket);

	Ticket getTicket(int idTic);
	
	List<Ticket> getTickets();
	

	
	void changeStatue(int idTicket);
}
