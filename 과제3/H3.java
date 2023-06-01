
public class H3 {
	public static void main(String[] args)
	{
		int a,b,t,sum,cnt=3;
		
		sum=2;
		a=1; b=1;
		
		System.out.print(a+" + "+b);
		while(cnt<=20)
		{
			t=a+b;
			a=b;
			b=t;
			sum = sum+t;
			
			cnt++;
			System.out.print(" + "+t);
		}
		System.out.print(" = "+sum);
	}
}
