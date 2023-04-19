public class Task001 {
    public static void main(String[] args) {
        float[] temperatures = {23.4f, 24.5f, 22.1f, 26.7f, 25.3f, 24.8f, 23.9f};
        float highestTemp = temperatures[0];
        float lowestTemp = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highestTemp) {
                highestTemp = temperatures[i];
            }
            if (temperatures[i] < lowestTemp) {
                lowestTemp = temperatures[i];
            }
        }

        System.out.println("Highest temperature: " + highestTemp);
        System.out.println("Lowest temperature: " + lowestTemp);
    }
}
