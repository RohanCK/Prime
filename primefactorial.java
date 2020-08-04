/**
 * 
 */
package prime;

/**
 * @author Rohan
 *
 */
public class primefactorial {
	public static int a[] = new int[10000000];
	public static int lowestprimefactor(int n) {
		a[0]=0;
		a[1]=1;

		int j=0;
		for (int i=2;i<=n;i++) {
			if(a[i]==0)
			{
				j=2;
				while((i*j)<=n) {
					if(a[i*j]==0) {
						a[i*j]=i;
						j++;
					}
					else
					j++;
				}
				a[i]=i;
			}
		}
		return	a[n];
			
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2000;
		int y=x;
		System.out.print("1");
		while(y!=1)
		{
			System.out.print("x"+lowestprimefactor(y));
			y/=lowestprimefactor(y);
		}
		

	}

}
