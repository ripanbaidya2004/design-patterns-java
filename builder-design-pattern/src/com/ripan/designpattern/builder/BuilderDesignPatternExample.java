package com.ripan.designpattern.builder;

public class BuilderDesignPatternExample {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();

        System.out.println("Veg Meal ");
        vegMeal.showItems();
        System.out.println("Price: "+vegMeal.getPrice());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

        System.out.println("NonVeg Meal ");
        nonVegMeal.showItems();
        System.out.println("Price: "+nonVegMeal.getPrice());

    }
}
