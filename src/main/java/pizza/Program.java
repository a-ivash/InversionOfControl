package pizza;

import ioc.Config;
import ioc.JavaConfig;
import ioc.SimpleIoC;
import pizza.repo.OrderRepoImpl;
import pizza.repo.PizzaRepoImpl;
import pizza.entity.Pizza;
import pizza.entity.User;
import pizza.service.OrderService;
import pizza.service.OrderServiceImpl;
import pizza.service.PizzaService;
import pizza.service.PizzaServiceImpl;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        SimpleIoC simpleIoC = buildIoC();
        PizzaService pizzaService = (PizzaService) simpleIoC.getBean("pizzaService");
        OrderService orderService = (OrderService) simpleIoC.getBean("orderService");

        System.out.println(pizzaService.getAllPizza());

        Pizza pizza1 = pizzaService.getPizzaByName("Hawaii");
        Pizza pizza2 = pizzaService.getPizzaByName("NotExistingPizza");

        orderService.placeOrder(new User(2, "Jack", "Jackson"),
                pizza1, pizza2);

        System.out.println(orderService.getAllOrders());
    }

    private static SimpleIoC buildIoC() {
        Config config = new JavaConfig(new HashMap<String, Class<?>>() {{
            put("orderRepo", OrderRepoImpl.class);
            put("pizzaRepo", PizzaRepoImpl.class);
            put("orderService", OrderServiceImpl.class);
            put("pizzaService", PizzaServiceImpl.class);
        }});

        return new SimpleIoC(config);
    }
}
