package com.vikrant.OOPS.Encapsulation;

public class OrderDriver {


        public static void main(String[] args) {
            // Create an order for two keyboards.
            Order order = new Order("Keyboard", 1500, 2);

            // Display the order details.
            order.getOrderDetails();

            // Complete payment through a controlled method.
            order.makePayment();

            // Attempt to pay again.
            order.makePayment();

            // Display updated order details.
            order.getOrderDetails();

            // This would cause a compilation error:
            // order.price = 1;
        }
    }


