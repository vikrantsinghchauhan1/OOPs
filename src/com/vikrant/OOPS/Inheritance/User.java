package com.vikrant.OOPS.Inheritance;


class User {

    // Common properties shared by all users
    String name;
    String email;

    // Parent class constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Common method inherited by child classes
    public void login() {
        System.out.println(name + " logged in successfully");
    }

    // Common method to display user information
    public void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

// Customer inherits from User
class Customer extends User {

    public Customer(String name, String email) {
        super(name, email);
    }

    public void placeOrder() {
        System.out.println(name + " placed an order");
    }
}

// Admin inherits from User
class Admin extends User {

    public Admin(String name, String email) {
        super(name, email);
    }

    public void manageProducts() {
        System.out.println(name + " is managing products");
    }
}

// DeliveryPartner inherits from User
class DeliveryPartner extends User {

    public DeliveryPartner(String name, String email) {
        super(name, email);
    }

    public void deliverOrder() {
        System.out.println(name + " is delivering an order");
    }
}



