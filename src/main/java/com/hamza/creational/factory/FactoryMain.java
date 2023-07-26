package com.hamza.creational.factory;

import com.hamza.creational.factory.phone.OS;
import com.hamza.creational.factory.phone.OperatingSystemFactory;
import com.hamza.creational.factory.pizza.NYStylePizzaStore;
import com.hamza.creational.factory.pizza.PizzaStore;
import com.hamza.creational.factory.pizza.entity.Pizza;

public class FactoryMain {

    public static void main(String[] args) {

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("Open");
        obj.spec();

        PizzaStore pizzaStore = new NYStylePizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Hamza ordered a " + pizza.getName() + "\n");
    }
}
