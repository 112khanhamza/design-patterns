package com.hamza.creational.factory.pizza.entity.impl;

import com.hamza.creational.factory.pizza.entity.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza () {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
