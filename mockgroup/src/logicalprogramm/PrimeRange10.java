package logicalprogramm;

public class PrimeRange10 {
	public static void main(String[] args) {
		int a=10;
		int b=50;
		int count;
		for (int n=a; n<=b; n++)
		{
			count=0;
			for (int i=1; i<=n; i++)
			{
				if (n%i==0)
					{
					count++;
					}
			}
		
		if (count ==2)
		{
			System.out.println(n);
		}
	}
	}
}
