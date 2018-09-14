package org.sla;

class Iguana {
    int age;
    String name;
    String petType;
    boolean eatsDryFood;

    void sayHi() {
        System.out.println("*silence*");
    }

    int getAge() {
        return age;
    }

    void describe() {
        System.out.println("I'm a " + petType + " named " + name + ".");
        System.out.println("I'm " + age*16 + " human years old.");
        if (eatsDryFood) {
            System.out.println("I eat dry food.");
        } else {
            System.out.println("I eat wet food.");
        }
    }
}