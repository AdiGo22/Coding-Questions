public class PlaceFlower {
    public boolean canplaceflowers(int[]flowerbed, int n){
        int count =0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
            boolean prevempty = i==0 || flowerbed[i-1]==0; //if previous of i is empty including edge case i.e i is at 0th pos
            boolean nextempty = i==flowerbed.length-1|| flowerbed[i+1]==0 ; // if next of i is empty including edge case i.e i is at last pos
            
       
        if(prevempty && nextempty){ //if both of them holds true plant a flower and increment the count;
            flowerbed[i]=1;
            count++;
        }
    }
    }
    return count>=n; // return if count as true if it is inside n
    }
}

