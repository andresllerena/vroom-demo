package com.vroom.demo.repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vroom.demo.model.Pizza;

@Repository
public class PizzaRepository implements IPizzaRepository {

	// Retrieving pizzas from CSV file for simplicity purposes
	// (In industry this would be a DB call)
	@Override
	public List<Pizza> getPizzas() {
		List<Pizza> pizzaList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(this.getClass().getResourceAsStream("/pizzas.csv")))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				pizzaList.add(new Pizza(values[0], values[1], new BigDecimal(values[2])));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pizzaList;
	}

}
