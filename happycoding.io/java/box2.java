import java.util.Scanner;

public class box2 {
  public static void main(String[] args) {
    System.out.println("enter the height, width and the character to be displayed in the form of a box");
    Scanner sc = new Scanner(System.in);

    int height = sc.nextInt();
    int width = sc.nextInt();
    char ch = sc.next().charAt(0);

    System.out.println("Your inputs are:");
    System.out.println("height = " + height + " width = " + width + " character = " + ch);

    System.out.println("Press 0 for an empty box, 1 for a filled box");
    int option = sc.nextInt();

    if (option == 1)
      for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
          System.out.print(ch);
        }
        System.out.println();
      }
    else
      for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
          if (i > 0 && i < height - 1) {
            if (j > 0 && j < width - 1) {
              System.out.print(" ");
            } else
              System.out.print(ch);
          } else
            System.out.print(ch);
        }
        System.out.println();
      }

  }
}
