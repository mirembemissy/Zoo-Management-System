/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursework.zoo;

/**
 *
 * @author pc
 */
public class Animal {
    protected String name;
    protected int age;
//constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal is making a sound");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    // Overloaded methods
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("This animal makes sound");
        }
    }

    public void eat(String foodType) {
        System.out.println("Animal is eating " + foodType);
    }

}


