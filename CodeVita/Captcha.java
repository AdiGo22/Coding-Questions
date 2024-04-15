import java.util.Scanner;

public class Captcha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < T; i++) {
            String[] input = scanner.nextLine().split(" ");
            double number = Double.parseDouble(input[0]);
            String name = input[1];

            String password = generatePassword(number, name);
            System.out.println(password);
        }

        scanner.close();
    }

    public static String generatePassword(double number, String name) {
        // Transform the given decimal number into scientific notation
        String scientificNotation = String.format("%.2e", number);

        // Simplify digits after the decimal point to a single digit
        String[] parts = scientificNotation.split("[eE]");
        String exponent = parts[1];
        int simplifiedExponent = simplifyDigits(exponent);

        // Create S1 by concatenating the first three letters of each digit
        String S1 = "";
        for (char c : parts[0].toCharArray()) {
            if (Character.isDigit(c)) {
                String word = convertToWord(Character.getNumericValue(c));
                S1 += word.substring(0, Math.min(3, word.length()));
            } else {
                S1 += c;
            }
        }

        // Create S2 by considering odd-positioned letters from the name
        String S2 = "";
        if (simplifiedExponent % 2 == 1) {
            for (int i = 0; i < name.length(); i++) {
                if ((i + 1) % 2 == 1) {
                    S2 += name.charAt(i);
                }
            }
        }

        return S1 + "@" + S2;
    }

    // Simplify the digits to a single digit
    public static int simplifyDigits(String num) {
        int sum = 0;
        for (char c : num.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        while (sum >= 10) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        return sum;
    }

    // Convert digit to word
    public static String convertToWord(int digit) {
        switch (digit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }
}
