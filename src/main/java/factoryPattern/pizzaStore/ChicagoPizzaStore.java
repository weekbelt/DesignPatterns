package factoryPattern.pizzaStore;

import factoryPattern.pizza.*;
import factoryPattern.pizza.ChicagoStyle.ChicagoStyleCheesePizza;
import factoryPattern.pizza.ChicagoStyle.ChicagoStyleClamPizza;
import factoryPattern.pizza.ChicagoStyle.ChicagoStylePepperoniPizza;
import factoryPattern.pizza.ChicagoStyle.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if(type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if(type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if(type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }

        return pizza;
    }
}
