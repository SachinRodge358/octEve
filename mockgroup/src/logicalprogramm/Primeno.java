package logicalprogramm;

public class Primeno {
	

	public static void main(String[] args) {
		int lower =10;
		int higher=50;
		int count;
		for (int n=lower;n<=higher; n++) {
			
		
		 count=0;
		for (int i=1; i<=n;i++)
		{
			if (n%i==0)
			{
				count ++;
			}
			}
		
		if (count ==2) 
		{
		
			System.out.println(n);
		}
		}
	}
		}
