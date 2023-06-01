import java.util.Scanner;

public class H_1 {
	public static void main(String[] args) {
		String s;
		int i,j,A;
		
		Scanner sc = new Scanner (System.in);
		
		s=sc.nextLine();
		
		i=s.charAt(0)-'0';
		j=s.charAt(2)-'0';
		
		if(s.charAt(1) == '+')
		{
			A=i+j;
			System.out.println(i+"+"+j+"="+A+"입니다.");
		}
		else if(s.charAt(1) == '-')
		{
			A=i-j;
			System.out.println(i+"-"+j+"="+A+"입니다.");
		}
		else if(s.charAt(1) == '*')
		{
			A=i*j;
			System.out.println(i+"*"+j+"="+A+"입니다.");
		}
		else if(s.charAt(1) == '/')
		{
			A=i/j;
			System.out.println(i+"/"+j+"="+A+"입니다.");
		}
		else if(s.charAt(1) == '%')
		{
			A=i%j;
			System.out.println(i+"%"+j+"="+A+"입니다.");
		}
		
		sc.close();
	}
}
