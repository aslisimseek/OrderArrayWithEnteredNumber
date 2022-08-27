import java.util.Arrays;
import java.util.Scanner;

public class OrderArrayWithEnteredNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter array length..:");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Please enter array " + (i+1) +". element..:");
            int number = scanner.nextInt();
            array[i] = number;
        }



        System.out.println(Arrays.toString(Arrays.stream(array).sorted().toArray()));

    }
}
