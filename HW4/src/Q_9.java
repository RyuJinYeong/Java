import java.util.Scanner;
public class Q_9 {
	public static void main(String[] args)
	{
		String stack[] = new String[100];
		int ch=0,cnt=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<4; i++)
		{
			System.out.println("자료 삽입 : ");
			stack[cnt] = sc.nextLine();
				
			System.out.print("스택 : "+stack[0]);
				
			for(int j=1; j<=cnt; j++)
				System.out.print(" "+stack[j]);
			System.out.println();
			cnt++;
		}
		
		for(int i=0; i<3; i++)
		{		
			System.out.println("\n자료 삭제 : ");
			stack[cnt] = sc.nextLine();
			
			cnt--;
			
			System.out.print("스택 : "+stack[0]);
			
			for(int j=1; j<cnt; j++)
				System.out.print(" "+stack[j]);
			
		}
		sc.close();
	}
}
