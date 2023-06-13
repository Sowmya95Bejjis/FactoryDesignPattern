package com.foodDeliverySystem.designPattern.users;

public class RestaurantOwner implements User{
    @Override
    public void register() {
        System.out.println("Inside RestaurantOwner::register() method... Registering Restaurant Owner");
    }
}
