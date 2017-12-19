package pizza.service;

import pizza.repo.PizzaRepo;
import pizza.entity.Pizza;
import pizza.entity.PizzaType;

import java.util.List;
import java.util.stream.Collectors;

public class PizzaServiceImpl implements PizzaService {
    private PizzaRepo pizzaRepo;

    public PizzaServiceImpl(PizzaRepo pizzaRepo) {
        this.pizzaRepo = pizzaRepo;
    }

    @Override
    public List<Pizza> getPizzaByType(PizzaType pizzaType) {
        List<Pizza> pizzas = pizzaRepo.getPizzas();
        return pizzas.stream().
                filter(pizza -> {return pizza.getPizzaType() == pizzaType;  }).
                collect(Collectors.toList());
    }

    @Override
    public List<Pizza> getAllPizza() {
        return pizzaRepo.getPizzas();
    }

    @Override
    public Pizza getPizzaByName(String pizzaName) {
        List<Pizza> pizzas = pizzaRepo.getPizzas();
        return pizzas.stream().
                filter(pizza -> { return pizza.getTitle().equals(pizzaName); }).
                findFirst().orElse(Pizza.notExisitingPizza());
    }
}
