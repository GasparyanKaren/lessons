public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[4];
        strings[0] = "Hello";
        strings[1] = "Java";
        strings[2] = "Bye";
        strings[3] = "Iteration";
//        System.out.println(strings[0]);
//        System.out.println(strings[2]);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();

        for (String string : strings) {
            System.out.println(string);
        }
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum = sum + x;
        }
            System.out.println();
            System.out.println(sum);

        int value = 0;
        String s = "Here is our home";
        System.out.println(s);


    }
}


//        numbers[1] = 20;
//        numbers[4] = 22;
//        System.out.println(numbers[0]);
//        System.out.println(numbers[1]);
//        System.out.println(numbers[4]);
