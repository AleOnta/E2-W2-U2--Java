package com.web_service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.thymeleaf.exceptions.TemplateInputException;

import com.web_service.model.ReservationRules;
import com.web_service.service.RulesService;


@Controller
public class RulesController {
	
	private RulesService rulesService = new RulesService();
	
	@GetMapping("/reservations/{lang}")
	public String printRules(ModelMap model, @PathVariable String lang) {
		ReservationRules rules = rulesService.defineLang(lang);
		model.addAttribute("langReq", rules);
		return "rulesPage";
	}
}
