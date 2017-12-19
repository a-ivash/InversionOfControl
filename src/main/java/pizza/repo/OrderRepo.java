package pizza.repo;

import pizza.repository.Order;

import java.util.List;

public interface OrderRepo {
    List<Order> getOrders();
    int getLastId();
    void addOrder(Order order);
}
