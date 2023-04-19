public class Task010 {
    public static void main(String[] args) {
        String[] names = {"Yana", "Bob", "Adrian", "Brandon", "Yana", "John"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i] == names[j]) {

                    System.out.println(names[j]);
                }
            }
        }
    }
}
