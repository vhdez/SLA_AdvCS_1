package org.sla;

class Cat {
    int age;
    String name;
    String petType;
    boolean eatsDryFood;

    void sayHi() {
        System.out.println("Meow!");
    }

    int getAge() {
        return age;
    }

    void describe() {
        System.out.println("I'm a " + petType + " named " + name + ".");
        System.out.println("I'm " + age + " human years old.");
        if (eatsDryFood) {
            System.out.println("I eat dry food.");
        } else {
            System.out.println("I eat wet food.");
        }
    }
}