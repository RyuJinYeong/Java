
public class H_3 {
	public static void main(String args[])
	{
		int i,j,cnt=0;
		String s[][] ={
		{"50000", "7000", "������"},
		{"5000", "250", "�����"},
		{"35000", "3500", "�ּ���"},
		{"20000", "1400", "�ڴ���"},
		{"15000", "1050", "������"}
		};
		String t[] = new String[3];
		
		for(i=0;i<=4; i++)
		{
			for(j=0; j<=4; j++)
			{
				if(Integer.parseInt(s[i][1]) < Integer.parseInt(s[j][1]))
				{
					t=s[i];
					s[i]=s[j];
					s[j]=t;					
				}
			}
		}
				
		for(i=0;i<=4; i++)
		{
			System.out.format("%s",i+1+" ");
			System.out.format(s[i][2]+" ");
			while(cnt<(Integer.parseInt(s[i][0])/1000))
			{
				cnt++;
				System.out.print("�� ");
			}
			System.out.print("("+Integer.parseInt(s[i][0])+")");
			System.out.println();
			cnt=0;
		}
	}
}
