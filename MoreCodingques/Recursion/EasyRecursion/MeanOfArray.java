package Recursion.EasyRecursion;

public class MeanOfArray {
	// Function Definition of findMean function 
	static float findMean(int A[], int N) 
	{ 
		if(N==1) {
			return A[N-1]; //if only one element present return the A[0]th element --> base case
		}else{
			return ((float)(findMean(A, N-1)*(N-1) + A[N-1])/ N);
		}
	} 
	
	// main Function 
	public static void main (String[] args) 
	{ 
		float Mean = 0; 
		int A[] = {1, 2, 3, 4, 5}; 
		int N = A.length; 
		System.out.println(findMean(A, N)); 
	} 
} 
