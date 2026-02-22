public class Maxmini {
    public static void max(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("num1 is greater");
        } else {
            System.out.println("num2 is greater");
        }
    }

    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        max(num1, num2);
    }
}
