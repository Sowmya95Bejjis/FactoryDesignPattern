package com.foodDeliverySystem.designPattern.users;

public class CustomerCareAgent implements User{
    @Override
    public void register() {
        System.out.println("Inside CustomerCareAgent::register() method... Registering Customer Care Agent");
    }
}
