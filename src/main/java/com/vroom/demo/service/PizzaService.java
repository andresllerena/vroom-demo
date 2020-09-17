package com.vroom.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vroom.demo.model.Pizza;
import com.vroom.demo.repository.IPizzaRepository;

@Service
public class PizzaService implements IPizzaService {

	@Autowired
	private IPizzaRepository pizzaRepository;

	@Override
	public List<Pizza> getPizzas() {
		return pizzaRepository.getPizzas();
	}
}
