
public class H_2 {
	public static void main(String args[])
	{
		int i,j;
		String msg = "번호   판매액    수당   판매자\n--------------------";
		String s[][] ={
		{"50000", "7000", "강된장"},
		{"5000", "250", "허수당"},
		{"35000", "3500", "최소주"},
		{"20000", "1400", "박대장"},
		{"15000", "1050", "김필자"}
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
		
		System.out.println(msg);
		
		for(i=0;i<=4; i++)
		{
			System.out.format("%s",i+1+"   ");
			for(j=0; j<=2; j++)
			{
				System.out.format("%5s",s[i][j]);
			}
			System.out.println();
		}
		
	}
}
