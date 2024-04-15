public class HighestAltitude {
        public int largestAltitude(int[] gain) {
          int sum =0; 
    
          int[] altitude = new int[gain.length+1];
          altitude[0] = 0; int max =0;
           for(int i =1;i<=gain.length;i++){
                sum+=gain[i-1];
                altitude[i]= sum;
                max = Math.max(max,altitude[i]);
            }
            return max;
        }
    }