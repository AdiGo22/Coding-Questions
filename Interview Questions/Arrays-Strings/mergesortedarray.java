import java.util.*;
//leetcode -88
public class mergesortedarray {
    public static void merge(int[]nums1,int m, int[]nums2,int n){
        //fill
        int[] n1 = new int[m];
        for(int i=0;i<m;i++){
            n1[i] = nums1[i];
        }//filled

        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(n1[i]<nums2[j]){
                nums1[k] = n1[i];
                i++;
            }else{
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        //if any is exhausted
        while(i<m){
        nums1[k] = n1[i];
        i++;
        k++;
        }
        while(j<n){
        nums1[k] = nums2[j];
        j++;
        k++;
        }
        System.out.print(nums1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();//len-(m+n)
        int[]nums1= new int[len];
       
        for(int i=0;i<len;i++){
          nums1[i] = sc.nextInt();
        }
        int m = sc.nextInt();//nums2
        int []nums2 =new int[m];
        for(int i=0;i<m;i++){
        nums2[i]= sc.nextInt();

        }
        merge(nums1,m,nums2,(len-m));
    
   sc.close();
    
    }
}
