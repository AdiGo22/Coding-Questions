public class productexceptself {
    public static int[] prod(int[]arr){
//method1 - uses extra space complexity
    int[]left = new int[arr.length];
    int[]right = new int[arr.length];
    int[]output = new int[arr.length];

  //boundaries marked
  left[0]=right[arr.length-1]=1;

 for(int i=1;i<arr.length;i++){
    left[i] = arr[i-1]*left[i-1];
 }//left of the current product

 for(int i=arr.length-2;i>=0;i--){
    right[i] = right[arr.length+1]*right[arr.length+1];
 }//right of the current product

 for(int i=0;i<arr.length;i++){
    output[i] = left[i]*right[i];
 }

 return output;
    }
}

