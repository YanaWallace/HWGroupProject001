public class Task004 {
    public static void main(String[] args) {
        int[][] arr = {
                {8,9,18},
                {88,99,45},
                {54,27,36}};
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                int number=arr[i][j];
                if (number%2==0){
                    sumEven=sumEven+number;
            } else if (number%2!=0) {
                    sumOdd=sumOdd+number;

                }

            }
        }
        System.out.println("Sum of even numbers is "+sumEven);
        System.out.println("Sum of odd numbers is "+sumOdd);
    }
}


