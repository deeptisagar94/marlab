package com.marlabs.test1;

public class ArrayRotation {
	
	
	public static int solution(int A[], int n, int k)
	{
		
	int temp ;
			  
			for (int i = 0; i < k; i++)
			{
				for (int j = A.length - 1; j > 0; j--)
				{
					 temp = A[j];
					A[j] = A[j - 1];
					A[j - 1] = temp;
		}
			}
	
		for(int i = 0; i < A.length; i++ )
		{
			System.out.println(A[i]);		
			
		}
		
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		int[]  A = {3, 8, 9, 7, 6};
		int N = 5;
		int K = 3;
		solution( A,  N,  K);
	}

}
