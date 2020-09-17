package com.vroom.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vroom.demo.model.Pizza;
import com.vroom.demo.service.IPizzaService;

@Controller
public class PizzaController {

	@Autowired
	private IPizzaService pizzaService;
	
	List<Pizza> pizzas;

	@RequestMapping("/")
	public String home(ModelMap model) {

		if (pizzas == null || pizzas.isEmpty())
			pizzas = pizzaService.getPizzas();

		model.addAttribute("pizzas", pizzas);
		
		return "home";
	}
}
