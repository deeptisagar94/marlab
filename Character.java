package com.marlabs.test1;

public class Character {
	
	public String repeatFront(String str, int i)
	{
		char ch[] = str.toCharArray();
		while(i != 0)
		{
		for(int n = 0; n <= i-1; n++)
		{
				System.out.print(ch[n]);	
		}
		i--;
	//	System.out.println(str);
		
		}
		System.out.println();
		return "hello";
	}
	
public static void main(String[] args) {
	Character ch = new Character();
	ch.repeatFront("Chocolate", 4);
	ch.repeatFront("Chocolate", 3);
	ch.repeatFront("Ice Cream", 2) ;
	
	
}
}
