public class Bird implements Flyer {
  public void fly() {
    System.out.println("fly birdie fly");
  }

  public static void main(String[] args) {
    Bird bird1 = new Bird();
    Flyer flyer1 = new Flyer() {
      public void fly() {
        System.out.println("flyer works");
      }
    };
    Flyer flyer2 = new Flyer() {
      public void fly() {
        System.out.println("flyer works");
      }
    };
    bird1.fly();
    System.out.println(bird1.getClass());
    flyer1.fly();
    System.out.println(flyer1.getClass());
    flyer2.fly();
    System.out.println(flyer2.getClass());
  }
}