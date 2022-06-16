package Cat;

import Animal.Animal;


public class Cat extends Animal {
  public void eat() {
    System.out.println("yummy mouse");
  }

  public static void main(String[] args) {
    Cat c = new Cat();
    c.speak();
    c.eat();
    Animal a = new Animal();
    a.speak();
    // a.eat();
    Animal ac = new Cat();
    ac.speak();
    ac.eat();
  }
}
