import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputValues = scanner.nextLine().split(" ");

        try {
            double inputNumber = Double.parseDouble(inputValues[0]);
            String inputName = inputValues[1];
            String result = passwordGenerator(inputNumber, inputName);
            System.out.println(result);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid");
        }

        scanner.close();
    }

    public static int reduceToSingleDigit(int number) {
        while (number >= 10) {
            int sum = 0;
            String numberStr = String.valueOf(number);
            for (int i = 0; i < numberStr.length(); i++) {
                sum += Character.getNumericValue(numberStr.charAt(i));
            }
            number = sum;
        }
        return number;
    }

    public static String passwordGenerator(double number, String name) {
        String[] ele = {"zer", "one", "two", "thr", "four", "fiv", "six", "sev", "eight", "nin"};
        String scientificNotation = String.format("%.7e", number);
        String val;
        String[] parts = scientificNotation.split("[eE]");
        String significantDigits = parts[0];
        String power = parts[1];

        int significantDigitsAfterPoint = Integer.parseInt(significantDigits.split("\\.")[1]);
        int result = reduceToSingleDigit(significantDigitsAfterPoint);

        String firstPart = ele[Integer.parseInt(significantDigits.split("\\.")[0])] + ".";
        if (power.equals("00")) {
            val = "e+";
        } else {
            val = "e-";
        }
        String secondPart = ele[result] + val + ele[Integer.parseInt(power)] + "@";

        StringBuilder thirdPartBuilder = new StringBuilder();
        if (Integer.parseInt(power) % 2 == 0) {
            for (int i = 1; i < name.length(); i += 2) {
                thirdPartBuilder.append(name.charAt(i));
            }
        } else {
            for (int i = 0; i < name.length(); i += 2) {
                thirdPartBuilder.append(name.charAt(i));
            }
        }
        String thirdPart = thirdPartBuilder.toString();

        return firstPart + secondPart + thirdPart;
    }
}
