package factoryPattern.pizzaStore;

import factoryPattern.pizza.*;
import factoryPattern.pizza.NYStyle.NYStyleCheesePizza;
import factoryPattern.pizza.NYStyle.NYStyleClamPizza;
import factoryPattern.pizza.NYStyle.NYStylePepperoniPizza;
import factoryPattern.pizza.NYStyle.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if(type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if(type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if(type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else {
            return null;
        }

        return pizza;
    }
}
