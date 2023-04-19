import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        int[] arr = {8,9, 18, 99, 89, 27, 36};


        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
