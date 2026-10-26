package com.vikrant.OOPS.Inheritance;

 class Animal {

    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{   //Dog is an animal
     public void eat(){
         super.eat();  //Call the parent implementation
         System.out.println("Dog is Eating");
     }


}