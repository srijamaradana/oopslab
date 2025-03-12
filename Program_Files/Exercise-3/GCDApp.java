import java.util.Scanner;

   class GCDCalculator {
    int a, b;

    void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
    }

    void findGCD() {
        int num1 = a, num2 = b;
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("GCD: " + num1);
    }
}

public class GCDApp {
    public static void main(String[] args) {
        GCDCalculator gcd = new GCDCalculator();
        gcd.inputNumbers();
        gcd.findGCD();
    }
}
