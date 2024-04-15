import java.util.*;
public class max2 {
    public static void max(int[]arr, int n){
  //using Math.max/min method
int max =Integer.MIN_VALUE;
int index =0;

for(int i=0;i<n;i++){
    max = Math.max(max,arr[i]);
}

for(int i=0;i<n;i++){
if(arr[i] == max){
    index = i;
    break;
}else{
    index++;
}
}
System.out.println(max);
System.out.println(index);
    }

public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []arr = new int[n];

    for(int i=0;i<n;i++){
    int input = sc.nextInt();
    arr[i] = input;
    //sc.close();
    }
    sc.close();
    max(arr,n);
}
}

/* In your second loop where you're searching for the index of the maximum value, 
the problem lies in how you're updating the index variable. Here's the relevant part of your original code for reference:
 for (int i = 0; i < n; i++) {
    if (arr[i] == max) {
        index = i;
    } else {
        index++;  // This is incorrect
    }
}

    You start iterating through the array using the variable i.
    If the value at index i is equal to the maximum value (max), you correctly update the index to i.
     This will store the index where the maximum value is found.
    However, if the value at index i is not equal to the maximum value, you incorrectly increment the index variable.
     This results in the index being increased for each non-maximum value encountered in the array.
      As a result, the index value becomes larger than the actual index where the maximum value was found.


      To fix this issue, as shown in the corrected code I provided earlier,
       you should update the index only when you find the maximum value and then use a break statement to exit the loop


 */


