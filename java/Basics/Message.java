package Basics;

public class Message {

  static int instanceCount = 0;

  String myMessage;

  public Message(String myMessage) {
    this.myMessage = myMessage;
    instanceCount++;
  }

  public void printMessage() {
    System.out.println(myMessage);
  }

  public static void printInstanceCount() {
    System.out.println("There are " + instanceCount + " instances of Message.");
  }

}