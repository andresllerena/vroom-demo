package com.vroom.demo.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PizzaController {

	List<List<String>> pizzas;

	@RequestMapping("/")
	public String home(ModelMap model) {

		if (pizzas == null || pizzas.isEmpty())
			pizzas = getPizzas();

		model.addAttribute("pizzas", pizzas);
		
		return "home";
	}

	public List<List<String>> getPizzas() {
		List<List<String>> pizzaList = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream("/pizzas.csv")))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(",");
		        pizzaList.add(Arrays.asList(values));
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pizzaList;
	}
}
