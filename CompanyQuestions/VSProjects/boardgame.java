import java.util.*;
public class boardgame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,String> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            list.add(input);
            if(list.get(i)%2!=0 && list.get(i)%3!=0&& list.get(i)%5!=0){
              map.put(list.get(i), "Second");
            }else{
                map.put(list.get(i),"First");
            }
        }
        for(Map.Entry<Integer,String>entry: map.entrySet()){
            System.out.println(entry.getValue());
        }
        sc.close();
    }
}