package com.marlabs.test1;

import java.util.HashSet;
import java.util.Set;

public class Solution {
public static int solution(int[] A)
{
	 
	        int num = 1;
	        Set<Integer> hashset = new HashSet<Integer>();

	        for (int i = 0 ; i < A.length; i++) 
	        {
	            hashset.add(A[i]);                     
	        }

	         while (hashset.contains(num)) 
	         {
	                num++;
	            }

	        return num;
	    }
	


public static void main(String[] args)
{
	int A[] = {1,3,6,4,1,2};
	solution(A);
}
}
