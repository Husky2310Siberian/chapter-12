package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.Order;

public class MainOrder {

    public static void main(String[] args) {

        Order newOrder = new Order(1, 22.5 , "pizza" , 4);

        System.out.println("description " + newOrder.getDescription());
        System.out.println("UUID: " +newOrder.getUuid());
        System.out.println("formatted timestamp " + newOrder.getFormattedTimeStamp());
    }
}
