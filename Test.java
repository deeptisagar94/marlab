package com.marlabs.test1;

public class Test {
	
	public static int scoreUp(char key[], char ans[])
	{
		int score = 0;
		for(int i = 0; i < key.length; i++)
		{
			if(key[i] == ans[i])
			{
				score  = score + 4;

			}else if(key[i] != ans[i])
			{
				score = score -1;
			}else
			{
				score = score + 0;
			}
		}
		System.out.println(score);
		return score;
	
	}
	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		char key[] = {'a', 'a', 'b','b'};
		@SuppressWarnings("unused")
		char ans[] = {'a', 'c', 'b','a'};
		@SuppressWarnings("unused")
		char ans1[] = {'a', 'b', 'b','c'};
		@SuppressWarnings("unused")
		char ans2[] = {'b', 'c', 'b','a'};
		
		scoreUp(key,ans1);
		
		
		
		
	}

}
