import java.util.*;

public class Main {

  static String one = "one";
  static String two = "two";
  static String three = "three";

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int count = input.nextInt();

    for(int i = 0; i < count; i++) {
      String s = input.next();

      char c;

      int w1 = 0;
      int w2 = 0;
      int w3 = 0;

      for(int j = 0; j < s.length(); j++) {
        c = s.charAt(j);

        if (s.length() == 3) {
          if (one.charAt(j) == c) {
            w1++;
          }
          if(two.charAt(j) == c) {
            w2++;
          }
        }

        if (s.length() == 5) {
          if (three.charAt(j) == c){
            w3++;
          }
        }
      }
      if (w1 >= 2)
        System.out.println("1");
      if (w2 >= 2)
        System.out.println("2");
      if (w3 >= 4)
        System.out.println("3");
    }
  }
}
