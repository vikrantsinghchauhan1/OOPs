package com.vikrant.OOPS.Encapsulation;


class Order {

    // Private data: cannot be accessed directly
    // or changed from another class.
    private String productName;
    private double price;
    private int quantity;
    private boolean paymentStatus;

    // Constructor initializes the order details.
    public Order(String productName, double price, int quantity) {

        this.productName = productName;

        // Validate the price.
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException(
                    "Price must be greater than zero"
            );
        }

        // Validate the quantity.
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException(
                    "Quantity must be greater than zero"
            );
        }

        // Initially, payment has not been completed.
        this.paymentStatus = false;
    }

    // Calculate the total order amount.
    public double calculateTotal() {
        return price * quantity;
    }

    // Display order information without exposing
    // the private variables directly.
    public void getOrderDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Paid: " + paymentStatus);
    }

    // Control how payment status can change.
    public void makePayment() {

        if (!paymentStatus) {
            paymentStatus = true;
            System.out.println("Payment successful");
        } else {
            System.out.println("Payment already completed");
        }
    }
}

