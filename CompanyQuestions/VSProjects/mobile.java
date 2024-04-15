import java.util.*;

class mobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] mobile = new String[n];
        
        for (int i = 0; i < n; i++) {
            mobile[i] = sc.next();
            if (mobile[i].length() > 10) {
                mobile[i] = mobile[i].substring(mobile[i].length() - 10);
            }
        }

        Arrays.sort(mobile);
        
        for (int i = 0; i < n; i++) {
            if (mobile[i].length() == 10) {
                System.out.println("+91 " + mobile[i].substring(0, 5) + " " + mobile[i].substring(5, 10));
            }
        }
    }
}
