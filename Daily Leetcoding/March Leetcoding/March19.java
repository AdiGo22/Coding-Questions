import java.util.Arrays;

public class March19 {
    public static int leastInterval(char[] tasks, int p) {
        int n = tasks.length;
        
        if(p == 0)
            return n;
        
        /*
        ["A","A","A","B","B","B"], k = 2
        A-3
        b-3
        A _ _ A _ _ A
        Number of chunks     = freq('A')-1 = 2
        Number of idol spots = (Number of chunks)*(p) = 2*2 = 4
            
        Now, we will try to fill these 4 idol spots
        If at the end idol spots is 0, it means all idol spots were enough
        to accomodate all other tasks. So, our result will be tasks.length;
        
        If idol spots are not empty, it means that we need more spaces (equal to idol spots)
        than the tasks.length to accomodate all tasks.
        So, result = tasks.length + idol_spots
        */
        
        int[] counter = new int[26];
        for(char ch : tasks) {
            counter[ch - 'A']++;
        }
        
        Arrays.sort(counter);
        
        int chunks = counter[25] - 1;
        int idolSpots = chunks * p;
        
        for(int i = 24; i >= 0 ; i--) {
            idolSpots -= Math.min(chunks, counter[i]);
        }
        
        if(idolSpots > 0)
            return n + idolSpots;
        
        return n;
    }

    public static void main(String[] args) {
     
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int p = 2;
        System.out.println(leastInterval(tasks, p)); // Output: 8
    }
}
