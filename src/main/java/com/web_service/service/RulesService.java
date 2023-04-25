package com.web_service.service;

import org.springframework.stereotype.Service;
import com.web_service.model.ReservationRules;

@Service
public class RulesService {
	
	//@Value("${it.rules.prenotazione}")
	private String regole = "Per effettuare una prenotazione è necessario fornire l'identità del utente intento a svolgere la prenotazione, la postazione d'interesse e la data prevista.";
	
	//@Value("${en.rules.reservation}")
	private String rules = "To make a reservation, the program will require a User that will be the owner of the reservation, the workstation of interest and the date of the reservation.";
	
	public ReservationRules defineLang(String param) {
		ReservationRules r = null;
		if (param.toLowerCase().equals("it")) {
			r = ReservationRules.builder()
					.rulesHead("Regole per effettuare la prenotazione di una postazione:")
					.rulesBody(regole)
					.rulesFoot("Esercizio 2 - Settimana 2 - Unità 2 -- Backend JavaSpring")
					.build();
		} else if (param.toLowerCase().equals("en")){
			r = ReservationRules.builder()
					.rulesHead("Rules to correctly reserve a workstation")
					.rulesBody(rules)
					.rulesFoot("Exercise 2 - Week 2 - Unit 2 -- Backend JavaSpring")
					.build();
		} else {
			
		}
		return r;
	}
}
