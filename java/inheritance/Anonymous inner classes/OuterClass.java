public class OuterClass {

  private String secretMessage = "hello";

  public void useInnerClass() {
    Printer myPrinter = new Printer() {
      public void print() {
        System.out.println(secretMessage);
      }
    };
    System.out.println(myPrinter.getClass());
    myPrinter.print();
  }

  public static void main(String[] args) {
    OuterClass outerClass = new OuterClass();
    outerClass.useInnerClass();
  }
}