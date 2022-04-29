import java.util.Scanner;

import static java.lang.System.in;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type age");
        String age = scanner.nextLine();
        switch (age) {
//            case 0:
//                System.out.println("You Finish school");
//            case 7:
//                System.out.println("Hello how are you");
//            case 18:
//                System.out.println("Shit happens");
//            default:
//                System.out.println("This is it");
            case "Tree":
                System.out.println("Total");
                break;
            case "Five":
                System.out.println("Liquid");
                break;
            case "Ten":
                System.out.println("Too much");
                break;
            default:
                System.out.println("Armenian");
        }
    }
}



