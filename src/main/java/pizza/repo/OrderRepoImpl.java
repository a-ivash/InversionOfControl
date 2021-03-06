package pizza.repo;

import pizza.entity.Order;
import pizza.entity.Pizza;
import pizza.entity.PizzaType;
import pizza.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderRepoImpl implements OrderRepo {
    private List<Order> orders = new ArrayList<Order>(){{
        add(new Order(1,
                Arrays.asList(new Pizza(1, "Hawaii", PizzaType.PIZZA_ONE, 100),
                        new Pizza(4, "Bacon", PizzaType.PIZZA_THREE, 130)),
                new User(1, "John", "Doe")));
    }};

    @Override
    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public int getLastId() {
        return (orders.size() == 0) ? 0 : orders.get(orders.size()-1).getOrderId();
    }
}
