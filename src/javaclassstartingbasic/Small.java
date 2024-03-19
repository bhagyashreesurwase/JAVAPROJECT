package javaclassstartingbasic;

public class Small {
	public static void main (String[]arg) {
		int[] i= {50,30,45,76,82,54,37,89};
		int min=i[0];
		for (int k=0;k<i.length;k++) 
		{
			if (i[k]<min)
			{
				min=i[k];
			}
		}
		System.out.println("smallest number is" +min);
		
	}

}
