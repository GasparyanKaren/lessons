public class Arrays {
    public static void main(String[] args) {
        int number = 10; //primitive data type [10]
        int[] numbers = new int[5];      //numbers -> [array]  reference type
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {2, 10, 5};
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
    }
}


// i = 0 -> numbers[i] 0 * 2 = 0 if numbers.length < 5 -> type 0
// i = 1 -> numbers[i] 1 * 2 = 2 if numbers.length < 5 -> type 2
// i = 2 -> numbers[i] 2 * 2 = 4 if numbers.length < 5 -> type 4
// i = 3 -> numbers[i] 3 * 2 = 6 if numbers.length < 5 -> type 6
// i = 4 -> numbers[i] 4 * 2 = 8 if numbers.length < 5 -> type 8


