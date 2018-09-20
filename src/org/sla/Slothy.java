package org.sla;

public class Slothy {
    int age;
    String name;
    String petType;
    boolean eatsDryFood;

    void sayHi() { System.out.println("~sleeeepy~"); }

    int getAge() { return age; }

    void describe() {
        System.out.println("I'm a " + petType + " named " + name + '.'+ "I Like to sleep~");
        System.out.println("I'm " + age + " human years old.");
        if (eatsDryFood) {
            System.out.println("I eat dry food.");
        } else {
            System.out.println("I eat wet food.");
        }
    }
}

