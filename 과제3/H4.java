import java.util.Scanner;

public class H4 {
	public static void main(String[] args)
	{
		int i,a,t;
		
		Scanner sc = new Scanner(System.in);

		i=sc.nextInt();
		a=sc.nextInt();
		
		if(i==1)
		{
			t=1;
			System.out.print("1");
			for(i=2; i<=a; i++)
			{
				System.out.print(" * "+i);
				t=t*i;
			}
			System.out.print(" = "+t);
		}
		else if(i==2)
		{
			t=a*a;
			
			System.out.println(a+"^2 = "+t);
		}
		else
		{
			System.out.print(a+" % "+i+" = "+(a%i));
		}
		
		sc.close();
	}
}
