public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9};
        double avarage = 0.0;
        for (int i = 1; i < numbers.length ; i++) {
            avarage += (1.0/i);
        }

        System.out.println(avarage);
    }
}