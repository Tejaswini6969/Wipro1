package patterns;

public class P25 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			k=1;
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<=n;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
}
