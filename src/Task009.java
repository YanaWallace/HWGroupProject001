import java.util.Arrays;

public class Task009 {
    public static void main(String[] args) {
        int[] arr = { 14, 46, 47, 109, 94, 52, 86, 36, 99, 89 };

        int largest = arr[0];
        int secLargest= arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>largest){
                largest=arr[i];

            } else if (arr[i] > secLargest && arr[i] <largest) {
                secLargest =arr[i];
            }
        }
        System.out.println(secLargest);
    }
}
