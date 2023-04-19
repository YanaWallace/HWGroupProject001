public class Task008 {
    public static void main(String[] args) {
        int[][] numbers = {
                {8, 9, 45, 9, 36},
                {8, 75, 94, 66, 33},
                {117, 54, 2, 77, 81}};

        int maxNum = numbers[0][0];
        int minNum = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > maxNum) {
                    maxNum = numbers[i][j];
                }
                if (numbers[i][j] < minNum) {
                    minNum = numbers[i][j];
                }
            }
        }
        System.out.println("Maximum number is "+maxNum);
        System.out.println("Minimum number is "+minNum);
    }
}


