public class Main {
    public static void main(String[] args) {
        int result = add(10,20);
        System.out.println("Result: " + result);
        boolean evenCheck = isEven(24);
        System.out.println("Is even: " + evenCheck);
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}