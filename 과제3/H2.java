import java.util.Scanner;

public class H2 {
	public static void main(String[] args)
	{
		int a,b,i;
		String temp,n;
		
		n="0";
		
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		
		temp=String.valueOf(a);
		
		for(i=5; i>=0; i--)
		{
			n += temp.charAt(i);
		}
		
		if(a==999999)
		{
			System.out.println("���α׷��� �����մϴ�.");
		}
		else
		{
			b=Integer.parseInt(n);
			System.out.println(a+"+"+b+"="+(a+b));
		}		
		sc.close();
	}
}
