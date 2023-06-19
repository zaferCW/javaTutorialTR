import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        int numbers []= {12,13,321,432,34,4323,4,23};

        int num = 34;
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));


        System.out.println("Arrays.binarySearch(numbers,34) = " +
                Arrays.binarySearch(numbers, num));

        System.out.println("Arrays.binarySearch(numbers,35) = "
                + Arrays.binarySearch(numbers, 35));//


    }

}