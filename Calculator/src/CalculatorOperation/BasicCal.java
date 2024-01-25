package CalculatorOperation;

import java.util.Scanner;

public class BasicCal {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Select Operation\n1 Add\n2 Subs\n3 Div\n4 Mul  ");
		int op=sc.nextInt();
		if(op==1)
		{
			System.out.println(a+b);
		}
		else if(op==2)
		{
			System.out.println(a-b);
		}
		else if(op==3)
		{
			System.out.println(a/b);
		}
		else
		{
			System.out.println(a*b);
		}
	}

}
