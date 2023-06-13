package com.foodDeliverySystem.designPattern;
import com.foodDeliverySystem.designPattern.users.User;

public class FactoryPatternDemo {
    /**
     * This project demonstrate the Factory Pattern - Its one of the Creational Design pattern
     * This pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class.
     * It takes out the responsibility of the instantiation of a class from the client program to the factory class.
     *
     * In our food delivery application, this pattern could be used at the registration step. Registration revolves around the User class which is common
     * for all kinds of users - enduser, deliveryAgent, customerCareAgent, restaurantOwner. Basic personal details like Name, address, contact number are
     * same for all userTypes and vary wrt details like license (for deliveryAgent), qualification (for customerCareAgent) etc
     */
    public static void main(String[] args) {

        UserFactory userFactory = new UserFactory();

        // create objects of each user and invoke the register method
        User endUser = userFactory.registerUser("END_USER");
        endUser.register();

        User deliveryAgent = userFactory.registerUser("DELIVERY_AGENT");
        deliveryAgent.register();

        User customerCareAgent = userFactory.registerUser("CUSTOMER_CARE_AGENT");
        customerCareAgent.register();

        User restaurantOwner = userFactory.registerUser("RESTAURANT_OWNER");
        restaurantOwner.register();
    }
}