package pizza.repo;


import pizza.repository.Pizza;

import java.util.List;

public interface PizzaRepo {
    List<Pizza> getPizzas();

    void addPizza(Pizza pizza);

    int getLastId();
}
