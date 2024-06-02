/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coursework.zoo;

/**
 *
 * @author pc
 */
public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Kaka", 7);
        Animal elephant = new Elephant("Bebe", 12);
        Animal monkey = new Monkey("Singa", 9);

        // Demonstrate method overriding
        System.out.println("\nLion");
        lion.makeSound();//overriden methods
        lion.eat();
        lion.makeSound(3);//overloaded methods
        lion.eat();
        
        
        System.out.println("\nElephant");
        elephant.makeSound();
        elephant.eat();
        elephant.makeSound(2);
        elephant.eat();
        
        System.out.println("\nMonkey");
        monkey.makeSound();
        monkey.eat();
        monkey.makeSound(4);
        monkey.eat();

        // Demonstrate method overloading (polymorphism)
        
       
    }   
}


