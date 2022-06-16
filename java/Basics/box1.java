package Basics;

import java.util.Scanner;

public class box1 {
  public static void main(String[] args) {
    System.out.println("enter the height, width and the character to be displayed in the form of a box");
    Scanner sc = new Scanner(System.in);

    int height = sc.nextInt();
    int width = sc.nextInt();
    char ch = sc.next().charAt(0);

    System.out.println("Your inputs are:");
    System.out.println("height = " + height + " width = " + width + " character = " + ch);

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print(ch);
      }
      System.out.println();
    }

  }
}
