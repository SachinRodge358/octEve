package logicalprogramm;

public class ArrayAssending {
	public static void main(String[] args) {
		int []a= {5,6,8,9,1	};
		int t;
		for (int i=0; i<a.length; i++) 
		{
			for (int j=i+1; j<a.length; j++)
			{
				if (a[i] < a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}}
		for (int i=0; i<a.length; i++) 
		{
			
			System.out.print(a[i]);
		}
		{
			System.out.println("max no is"+a[0]);
			System.out.println("min n is"+a[a.length-1]);
		}
		
		
			
			
			}
			}
			
		
		


