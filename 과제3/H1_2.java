public class H1_2 {
	public static void main(String[] args)
	{
		int n[][] = new int[5][5];
		int i,j,cnt;
		
		cnt=1;
		
		for(i=0; i<=4; i++)
		{
			for(j=0; j<=i; j++)
			{
				n[i][j]=cnt;
				cnt++;
			}
		}
		
		
		for(i=0; i<=4; i++)
		{
			for(j=0; j<=4; j++)
			{
				System.out.format("%-3d",n[i][j]);
			}
			System.out.println();
		}
	}
}
