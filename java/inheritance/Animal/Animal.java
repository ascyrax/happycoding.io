package Animal;

public class Animal {
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public void printName() {
    System.out.println("My name is: " + name);
  }

  public void eat() {
    System.out.println("munch munch");
  }

  public void speak() {
    System.out.println("Animals dont speak");
  }
}
