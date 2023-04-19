public class Task006 {
    public static void main(String[] args) {
        int number = 36;
        boolean check = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(number + " is prime number");
        } else {
            System.out.println(number + " is not prime number");
        }
    }
}
