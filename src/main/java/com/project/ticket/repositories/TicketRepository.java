package com.project.ticket.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.ticket.models.Ticket;



public interface TicketRepository  extends JpaRepository<Ticket, Integer>{
	
	@Query("Select t from Ticket t where t.user.id =:idUser")
	List<Ticket> getByUser(@Param("idUser") int idUser);
}