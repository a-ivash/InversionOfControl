package pizza.service;

import pizza.entity.Order;
import pizza.entity.Pizza;
import pizza.entity.User;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order placeOrder(User user, Pizza... pizzas);
}
