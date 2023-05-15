package com.project.ticket.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ticket.models.Ticket;
import com.project.ticket.repositories.TicketRepository;


	@Service
	public class TicketServiceImpl implements TicketService{

		@Autowired
		TicketRepository ticketRepo;
		
		
		@Override
		public void ajouter(Ticket ticket) {
			ticketRepo.save(ticket);		
		}

		@Override
		public void supprimer(int idTic) {
			ticketRepo.deleteById(idTic);
		}

		@Override
		public void modifier(Ticket ticket) {
			Ticket t = ticketRepo.getById(ticket.getId());
			if (t != null)
				ticketRepo.save(t);
		}

		@Override
		public Ticket getTicket(int idTic) {
			return ticketRepo.getById(idTic);
		}
		
		@Override
		public void changeStatue(int idTicket) {
			Ticket t= ticketRepo.getById(idTicket);
			
			if(t.getStatue().equals("new"))
				t.setStatue("en traitement");
			else if(t.getStatue().equals( "en traitement"))
				t.setStatue("résoulu");
			System.out.println(t.getId());
			ticketRepo.save(t);
		}



		@Override
		public List<Ticket> getTickets() {
			return ticketRepo.findAll();
		}

	}

