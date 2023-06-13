package com.foodDeliverySystem.designPattern;
import com.foodDeliverySystem.designPattern.users.*;

public class UserFactory {
    /**
     * Factory that generates object of concrete class based on given information, here its UserType
     * @param userType
     * @return the registered User
     */
    //use registerUser method to register the kind of user
    public User registerUser(String userType){
        if(userType == null){
            return null;
        }
        if(userType.equalsIgnoreCase("END_USER")){
            return new EndUser();

        } else if(userType.equalsIgnoreCase("DELIVERY_AGENT")){
            return new DeliveryAgent();

        } else if(userType.equalsIgnoreCase("CUSTOMER_CARE_AGENT")){
            return new CustomerCareAgent();
        }
        else if(userType.equalsIgnoreCase("RESTAURANT_OWNER")){
            return new RestaurantOwner();
        }

        return null;
    }

}
