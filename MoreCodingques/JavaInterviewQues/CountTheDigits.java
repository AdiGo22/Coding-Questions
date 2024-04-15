package JavaInterviewQues;

public class CountTheDigits {
    //count the digits
    public static int Count (long n) {
      String number = Long.toString(n);
      return number.length();
    }

    public static void main(String[] args) {
        long n = 88888;
        System.out.println(Count(n));
    }
}
