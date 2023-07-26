package com.hamza.creational.factory.pizza;

import com.hamza.creational.factory.pizza.entity.Pizza;
import com.hamza.creational.factory.pizza.entity.impl.NYStyleCheesePizza;
import com.hamza.creational.factory.pizza.entity.impl.NYStyleClamPizza;
import com.hamza.creational.factory.pizza.entity.impl.NYStylePepperoniPizza;
import com.hamza.creational.factory.pizza.entity.impl.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
