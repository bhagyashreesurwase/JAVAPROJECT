package javaclassstartingbasic;

public class Largestnumber {
	public static void main (String[]arg) {
		int[] i= {50,30,45,76,82,54,37,89};
		int max=0;
		for (int k=0;k<=i.length-1;k++) 
		{
			if (i[k]>max)
			{
				max=i[k];
			}
		}
		System.out.println("largest number is" +max);
		
	}

}
