package com.vikrant.OOPS.Inheritance;

public class UserDriver {
        public static void main(String[] args) {
            Customer customer = new Customer("Rahul", "rahul@gmail.com");

            Admin admin = new Admin("Amit", "amit@gmail.com");

            DeliveryPartner delivery = new DeliveryPartner("Ravi", "ravi@gmail.com");

            // Inherited methods
            customer.login();
            customer.displayProfile();

            // Customer's own method
            customer.placeOrder();

            // Admin's inherited and own methods
            admin.login();
            admin.manageProducts();

            // Delivery partner's inherited and own methods
            delivery.login();
            delivery.deliverOrder();
        }
    }

