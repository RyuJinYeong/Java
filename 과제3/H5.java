
public class H5 {
	public static void main(String[] args)
	{
		int a[] = {40,2,32,17,25,24,20,30,31,5},i,j,t;
		
		for(i=0; i<=9; i++)
		{
			for(j=i; j<=9; j++)
		    { 
		        if(a[i]>a[j])
		        {
		            t=a[i];
		            a[i]=a[j];
		            a[j]=t;
		        }
		    }
		}
		
		for(i=0; i<=9; i++)
			System.out.print(a[i]+" ");
	}
}
