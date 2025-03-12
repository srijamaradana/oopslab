import java.util.Scanner;

class TemperatureConverter {
    double celsius;

    void inputTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        celsius = scanner.nextDouble();
    }

    void convert() {
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}

public class TemperatureApp {
    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter();
        temp.inputTemperature();
        temp.convert();
    }
}
