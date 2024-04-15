import java.util.*;

public class Autobiographical {
    public static int calculateDigitFrequencySum(String s) {
        int sum = 0;
        char c;
        int result = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            arr.add(c - '0');
            sum += c - '0';
        }

        if (sum == s.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(arr.get(i))) {
                    map.put(arr.get(i), map.get(arr.get(i)) + 1);
                } else {
                    map.put(arr.get(i), 1);
                }
            }

            for (int i = 0; i < s.length(); i++) {
                result += map.get(arr.get(i)); // Use i to get the frequency of digit i
            }

            return result;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.print(calculateDigitFrequencySum(n));
        sc.close();
    }
}
//wrong