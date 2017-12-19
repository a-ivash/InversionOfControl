package pizza.repo;


import pizza.entity.Pizza;

import java.util.List;

public interface PizzaRepo {
    List<Pizza> getPizzas();

    void addPizza(Pizza pizza);

    int getLastId();
}
