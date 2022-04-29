import java.util.Scanner;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Type something");
//        String string = s.nextLine();   // type string -> ("You type something " + string)
        int x = s.nextInt();    // type number -> ("You type something " + 10,12,15....number)
        System.out.println("You type something " + x);
    }
}



//public class Input {
//    public static void main(String[] args) {
//       Scanner s = new Scanner(System.in);
//        System.out.println("Hello some number");
//       int x = s.nextInt();
//        System.out.println("yes this is " +x);
//}}