package com.hamza.creational.factory.pizza.entity.impl;

import com.hamza.creational.factory.pizza.entity.Pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza () {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square shapes");
    }
}
