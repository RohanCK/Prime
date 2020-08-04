/**
 * 
 */
package prime;

/**
 * @author Rohan
 * Naive solution using Brute Force for generating ugly numbers 
 *
 */
public class UglyNumNaive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		System.out.println(nthUglyNumber(x));
	}
	public static int nthUglyNumber(int n) {
        int t=0,count=2,j=0;
        int a[]= new int[1692];
        a[0]=0;
        a[1]=1;
		for (int i=2;a[n]==0;i++) {
			
            j=i;	
            while(j>0 && j!=1){
                    if(j%2==0)
                    {
                        j/=2;
                        t++;
                    }
                    else 
                        if(j%3==0)
                            {
                        j/=3;
                        t++;
                    }
                    else 
                        if(j%5==0)
                    {
                        j/=5;
                        t++;
                    }
                    else
                    {
                        t=0;
                        break;
                    }
                
                }
            if(t>0 && j==1)
            {
                a[count]=i;
                count++;
            }
        }

		return	a[n];
			
    }
}
