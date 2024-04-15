import java.util.*;

public class HackerRankCompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int n = a.size();
        ArrayList<Integer> result = new ArrayList<>();
        int counta = 0, countb = 0;
        
        for (int i = 0; i < n; i++) {
            if (a.get(i) > b.get(i)) {
                counta++; // Increment counta by 1
            } else if (a.get(i) < b.get(i)) {
                countb++; // Increment countb by 1
            }
        }
        result.add(counta);
        result.add(countb);
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String ina = sc.nextLine();
        String inb = sc.nextLine();
        String inputa[] = ina.split("\\s+");
        String inputb[] = inb.split("\\s+");
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < inputa.length; i++) {
            a.add(Integer.valueOf(inputa[i]));
        }
        for (int i = 0; i < inputb.length; i++) {
            b.add(Integer.valueOf(inputb[i]));
        }
        System.out.println(compareTriplets(a, b));
    }
}
