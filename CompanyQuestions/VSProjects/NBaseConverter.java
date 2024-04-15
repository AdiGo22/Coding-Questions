import java.util.Scanner;

public class NBaseConverter {
    public static String DectoNBase(int n, int num) {
        if (n <= 1 || n > 36) {
            throw new IllegalArgumentException("Invalid base. 1 < n <= 36 expected.");
        }

        char[] symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        String result = "";

        while (num != 0) {
            int rem = num % n;
            char remainder;
            if (rem > 9) {
                remainder = symbols[rem];
            } else {
                remainder = (char) (rem + '0');
            }
            result = remainder + result; //concatenating together
            num /= n;//updated
        }

        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        String nBaseRepresentation = DectoNBase(n, num);
        System.out.println(nBaseRepresentation);
        sc.close();
    }
}

