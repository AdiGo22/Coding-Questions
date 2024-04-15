import java.io.*;
import java.util.*;

class subsetss
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();

            sc.close();
        }  
    }
}

    class Solution{
        //function void type will have parameters to perform further recursion 

        void func(int N,int ind ,ArrayList<Integer>arr , ArrayList<Integer>subsetSums,int sum) {
            //introduce the base case
            if(ind == N){
                subsetSums.add(sum);
                return; //come out
            }//base case 


            //recursion cases
            func(N,ind+1,arr,subsetSums,sum+arr.get(ind)); // when considering the index
            func(N,ind+1,arr,subsetSums,sum); //when not considering the index
            //recursion finish 
        }
        //exit of void function

       ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){ // this is a calling arraylist function
        ArrayList<Integer> subsetSums = new ArrayList<>();
         func(N,0,arr,subsetSums,0); 
         // initialised the parameters for func and passed it to the main function - func

         Collections.sort(subsetSums); //sorted the list
         return subsetSums;
       }
    }
     // runtime complexity - 2^n log(2^n)
     