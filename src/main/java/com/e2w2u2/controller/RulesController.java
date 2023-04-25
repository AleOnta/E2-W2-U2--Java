package com.e2w2u2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.e2w2u2.model.ReservationRules;
import com.e2w2u2.service.RulesService;

@Controller
@RequestMapping("(/reservations")
public class RulesController {
	
	@Autowired private RulesService rulesService;
	
	@GetMapping("/rules/{lang}")
	public String stampaRegole(ModelMap model, @PathVariable String lang) {
		ReservationRules rules = rulesService.defineLang(lang);
		model.addAttribute("langReq", rules);
		return "rulesPage";
	}
	
}
