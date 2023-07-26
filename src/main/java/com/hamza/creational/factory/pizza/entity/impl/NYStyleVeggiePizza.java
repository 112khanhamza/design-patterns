package com.hamza.creational.factory.pizza.entity.impl;

import com.hamza.creational.factory.pizza.entity.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza () {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
