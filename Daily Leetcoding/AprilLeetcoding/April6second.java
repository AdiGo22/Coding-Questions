package AprilLeetcoding;

public class April6second {
    public static String minimumRemove(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();

        int lastOpen = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c))
                result.append(c);
            else if (c == '(') {
                result.append(c);
                lastOpen++;
            } else if (lastOpen > 0) {
                lastOpen--;
                result.append(c);
            }
        }

        if (result.length() == 0)
            return "";

        // Reverse the result string
        result.reverse();

        StringBuilder finalResult = new StringBuilder();
        int lastClose = 0;
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            if (Character.isLetter(c))
                finalResult.append(c);
            else if (c == ')') {
                finalResult.append(c);
                lastClose++;
            } else if (lastClose > 0) {
                lastClose--;
                finalResult.append(c);
            }
        }

        return finalResult.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minimumRemove(s));
    }
}
