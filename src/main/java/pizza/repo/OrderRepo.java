package pizza.repo;

import pizza.entity.Order;

import java.util.List;

public interface OrderRepo {
    List<Order> getOrders();
    int getLastId();
    void addOrder(Order order);
}
