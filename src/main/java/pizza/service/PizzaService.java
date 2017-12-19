package pizza.service;

import pizza.entity.Pizza;
import pizza.entity.PizzaType;

import java.util.List;

public interface PizzaService {
    List<Pizza> getPizzaByType(PizzaType pizzaType);
    List<Pizza> getAllPizza();
    Pizza getPizzaByName(String pizzaName);
}
