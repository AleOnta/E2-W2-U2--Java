package com.e2w2u2.service;

import org.springframework.beans.factory.annotation.Value;

import com.e2w2u2.model.ReservationRules;

public class RulesService {
	
	@Value("${regole.prenotazione.it}")
	private String regole;
	
	@Value("${regole.prenotazione.en}")
	private String rules;
	
	public ReservationRules defineLang(String param) {
		ReservationRules r = null;
		if (param.toLowerCase().equals("it")) {
			r = ReservationRules.builder()
					.rulesHead("Regole per effettuare la prenotazione di una postazione:")
					.rulesBody(regole)
					.rulesFoot("Esercizio 2 - Settimana 2 - Unità 2 -- Backend JavaSpring")
					.build();
		} else {
			r = ReservationRules.builder()
					.rulesHead("Rules to correctly reserve a workstation")
					.rulesBody(rules)
					.rulesFoot("Exercise 2 - Week 2 - Unit 2 -- Backend JavaSpring")
					.build();
		}
		return r;
	}
}
