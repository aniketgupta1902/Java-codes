package XYZ;

import java.util.Scanner;

public class seq {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		int a=scn.nextInt();
		scn.nextLine();
		int b=scn.nextInt();
		scn.nextLine();
		int sum=0;
		int i;
	System.out.println("first number is"+a);
	System.out.println("second number is"+b);
	for (i=1;i<=13;i++)
	{  System.out.println(a);
	System.out.println(b);
	sum=a+b;
	a=b;
	b=sum;
		
	}

	
	}

}
