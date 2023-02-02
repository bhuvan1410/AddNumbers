public class AddNumbers {

    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    public static void main(String[] args) {

        int num1 = 38;
        int num2 = 0;

        int add1 = addDigits(num1);
        int add2 = addDigits(num2);

        System.out.println("The digits added together in " + num1 + " is " + add1);
        System.out.println("The digits added together in " + num2 + " is " + add2);

    }
}
