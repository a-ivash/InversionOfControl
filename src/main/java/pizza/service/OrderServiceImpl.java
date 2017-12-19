package pizza.service;

import pizza.repo.OrderRepo;
import pizza.entity.Order;
import pizza.entity.Pizza;
import pizza.entity.User;

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
