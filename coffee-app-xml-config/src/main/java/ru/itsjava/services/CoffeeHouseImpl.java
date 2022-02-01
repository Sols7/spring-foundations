package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CoffeeHouseImpl implements CoffeeHouse{
    private final CoffeeService coffeeService;

    @Override
    public void buyCoffee() {
        System.out.println("Hello");
        System.out.println("Your coffee: " + coffeeService.getCoffeeByPrice(100.0));
    }
}
