package prime;

public class GeneratePrime {
	public static int a[] = new int[10000000];
	public static void generateprime(int n) {
		a[0]=0;
		a[1]=0;
		int j=0;
		for (int i=2;i<=n;i++) {
			if(a[i]==0)
			{
				j=2;
				while((i*j)<=n) {
						a[i*j]=1;
						j++;
					}
			}
		}
		for(int i=1;i<=n;i++)
			{
			if(a[i]==0)
				System.out.println(i);
			}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		generateprime(x);

	}

}
