package com.project.ticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.ticket.services.UserService;
import com.project.ticket.models.User;

@Controller
	@RequestMapping("/")

public class UserController {
	
	
		@Autowired
		private UserService userService;

		
		@GetMapping("admin/affecter/{id}")
		public String AffecterBugs(Model m,@PathVariable int id) {
			User us = new User();
			
			m.addAttribute("devs",userService.getDevs());
			m.addAttribute("user",us);
			return "users/affecter";
		}
		
		@PostMapping("admin/affecter/")
		public String enregistrer(@RequestParam(value = "idDev",required=false) int idDev ,@RequestParam(value="idBug",required=false) int id) {
			
			userService.affecter(id, idDev);
			return " redirect:/admin";
		}

}
