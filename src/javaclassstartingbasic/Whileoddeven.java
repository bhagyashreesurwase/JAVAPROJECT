package javaclassstartingbasic;

public class Whileoddeven {
	public static void main(String[]arg) {
		int a=1;
		while(a<=100)
		{
			if(a%2==0)
			{
				System.out.println(" number is even:-"+a);
				
			}
			else
			{
				System.out.println(" number is odd:-"+a);
			}
			a++;
		}
	}

}
