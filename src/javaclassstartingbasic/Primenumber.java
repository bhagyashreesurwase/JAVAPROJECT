package javaclassstartingbasic;

public class Primenumber {
	public static void main(String[]arg) {
		int a=102;
		int c=0;
		int b=2;
		while(b<a)
		{
			if (a%b==0)
			{
				c++;
			}
			b++;
		}
		if (c==0){
			{
				System.out.println(" no is prime");
			}
		}
		else
		{
			System.out.println("number is  not primr");
		}
				
	}

}
