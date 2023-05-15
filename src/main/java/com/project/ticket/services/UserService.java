package com.project.ticket.services;

import java.util.List;

import com.project.ticket.models.Ticket;
import com.project.ticket.models.User;



public interface UserService {
	
		
		List<User> getUsers();

		List<User> getDevs();

		void ajouter(User user);
		
		void supprimer(int iduser);

		void modifier(User user);

		User getUser(int idUser);
		
		List<Ticket> getTickets(int idUser);
		
		void affecter(int idBug ,int idDev);
		
		
	
}
