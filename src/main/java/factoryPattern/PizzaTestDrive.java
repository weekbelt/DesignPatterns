package factoryPattern;

import factoryPattern.pizza.Pizza;
import factoryPattern.pizzaStore.ChicagoPizzaStore;
import factoryPattern.pizzaStore.NYPizzaStore;
import factoryPattern.pizzaStore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
