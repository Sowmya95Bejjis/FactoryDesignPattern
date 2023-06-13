package com.foodDeliverySystem.designPattern.users;

public class DeliveryAgent implements User{
    @Override
    public void register() {
        System.out.println("Inside DeliveryAgent::register() method... Registering DeliveryAgent");
    }
}
