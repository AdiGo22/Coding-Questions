import java.util.*;
public class groupleader{
    public static String group(int n,String s){
     ArrayList<String> arr = new ArrayList<>();
     HashMap<String , Integer> map = new HashMap<>();
     int index=0;
       for(int i=0;i<s.length();i++){
           String str[] = s.split(" ");
           arr.add(str[i]);
           
           if(map.containsKey(arr.get(i))){
            map.put(arr.get(i),index+1);
           }else{
            map.put(arr.get(i),1);
           }
        }
         int ans=0;
        for(Map.Entry<String,Integer>mapelement:map.entrySet()){
            String value = mapelement.getKey();
            int val = Integer.parseInt(value);
            if(val==1){
               ans = mapelement.getValue(); 
            }
        }
         return String.valueOf(ans); 
    }
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        sc.close();
        System.out.println(group(n,s));
    }
}