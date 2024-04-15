public class NumOfLaserBeams {
    public static int NumberOfBeams ( String [] bank) {
    
       
         int total = 0;
         int prevDevice = 0;
         
        for(int i = 0;i<bank.length;i++) {
              int currDevice = 0; //set to zero after exiting from inner loop
             for(int j=0;j<bank[0].length();j++) {
                if(bank[i].charAt(j) == '1'){
                    currDevice++;
                }
             }
            

            total+=(prevDevice * currDevice);

            prevDevice = (currDevice == 0)? prevDevice : currDevice;  
        // prevDevice will be the same if currDevice = 0 else it will be currDevice for next iteration
            }
        return total;
        }
         
        public static void main(String[] args) {
            String[] bank = new String[] {"011001","000000","010100","001000"};
            System.out.println(NumberOfBeams(bank));
        }
}



     