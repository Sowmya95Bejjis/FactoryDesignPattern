package com.foodDeliverySystem.designPattern.users;

public class EndUser implements User{
    @Override
    public void register() {
        System.out.println("Inside EndUser::register() method... Registering Actor");
    }
}
