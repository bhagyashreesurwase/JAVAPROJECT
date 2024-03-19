package javaclassstartingbasic;

public class Pattern {
	public static void main(String[]arg) {
		for(int a=1;a<=5;a++)
		{
			for (int b=1;b<=a;b--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
