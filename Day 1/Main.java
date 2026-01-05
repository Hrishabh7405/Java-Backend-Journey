public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 11, 14};
        for (int i = 0; i < numbers.length; i++) {
            String oddEven = oddEven(numbers[i]);
            System.out.println("Number " + numbers[i] + " is " + oddEven);
        }
    }
    public static String oddEven(int number){
        if (number % 2 == 0) {
            return "even.";
        } else {
            return "odd.";
        }
    }
}