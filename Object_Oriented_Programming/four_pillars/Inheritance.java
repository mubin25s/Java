package four_pillars;

/**
 * INHERITANCE
 * Definition: A mechanism where one class acquires the properties (fields) 
 * and behaviors (methods) of another class.
 */

// Parent Class (Superclass)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating...");
    }
}

// Child Class (Subclass) inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Inherited field from Animal
        myDog.name = "Buddy";
        
        // Inherited method from Animal
        myDog.eat();
        
        // Specific method from Dog
        myDog.bark();
    }
}
