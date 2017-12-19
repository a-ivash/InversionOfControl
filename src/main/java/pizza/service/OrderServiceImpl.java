package pizza.service;

import pizza.repo.OrderRepo;
import pizza.repository.Order;
import pizza.repository.Pizza;
import pizza.repository.User;

import java.util.Arrays;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderRepo orderRepo;

    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepo.getOrders();
    }

    @Override
    public Order placeOrder(User user, Pizza... pizzas) {
        int lastId = orderRepo.getLastId();
        Order order = new Order(lastId + 1, Arrays.asList(pizzas), user);
        orderRepo.addOrder(order);
        return order;
    }
}
