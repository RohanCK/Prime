/**
 * 
 */
package prime;

/**
 * @author Rohan
 *
 */
public class HighestPrimeFactor {

	/**
	 * @param args
	 */
	public static int a[] = new int[10000000];
	public static void highestprimefactor(int n) {
		a[0]=0;
		a[1]=1;

		int x=2;
		int j=0;
		for (int i=2;i<=n;i++) {
			if(a[i]==0)
			{
				j=2;
				while((i*j)<=n) {
					if(x<i)
					{
						x=i;
						a[i*j]=x;
					}
					else
					a[i*j]=x;
					j++;
				}
				a[i]=i;
			}
		}
		for(int i=1;i<=n;i++)
			System.out.println(a[i]);
			
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		highestprimefactor(x);

	}
	

}
