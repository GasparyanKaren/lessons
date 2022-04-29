import java.util.Scanner;

public class Test1 {


    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.method();
    }




    public void method (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tpi mi tiv");
        int a = scanner.nextInt();
        System.out.println("2rd tiv");
        int b = scanner.nextInt();
        System.out.println(a+b);

    }

}
