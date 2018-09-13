package org.sla;

public class Dog {
    int age;
    String name;
    String petType;
    boolean eatsDryFood;

    void sayHi() {
        System.out.println("Woof!");
    }

    int getAge() {
        return age;
    }

    void describe() {
        System.out.println("I'm a " + petType + " named " + name + ".");
        System.out.println("I'm " + age*7 + " dog years old.");
        if (eatsDryFood) {
            System.out.println("I eat dry food.");
        } else {
            System.out.println("I eat wet food.");
        }
    }
}