package com.hamza.creational.factory.pizza;

import com.hamza.creational.factory.pizza.entity.Pizza;

public class PizzaMain {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        Pizza pizza = nyStore.orderPizza("clam");
        System.out.println("Hamza ordered a " + pizza.getName());
    }
}
