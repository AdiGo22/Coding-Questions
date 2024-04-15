import java.util.*;
public class geroupleaderroom {
    public static int room(int n,int []arr){
        //n - room number list;
        HashMap<Integer,Integer> map = new HashMap<>();
        int index=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
        map.put(arr[i],index++);
        }else{
            map.put(arr[i],1);
        }
    }
    int ans=0;
    for(Map.Entry<Integer,Integer>mapelement: map.entrySet()){
        int value = mapelement.getKey();
        if(value==1){
            ans =mapelement.getValue();
        }
    }
    return ans;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[]arr = new int[n];
    for(int i=0;i<n;i++){
       int input = sc.nextInt();
      arr[i]=input;
    }
    System.out.print(room(n,arr));
}
}

