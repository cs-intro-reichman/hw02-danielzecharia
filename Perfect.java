/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
public static void main (String[] args) {
    int n = Integer.parseInt(args[0]);
	boolean div=false;
	int sum=1;
	int length=0;
	int n2=0;
	
	String s1 = n + " is a perfect number since " + n + " = 1";
	

	for (int i=2; i<n; i++)
	{
		div = (n%i==0);
		if (div)
		{
		  s1 = s1 + " + " + String.valueOf(i);
		  sum = sum+i;
		}
	}

	if (sum==n)
		System.out.print(s1);
	else 
		System.out.print(n + " is not a perfect number");

	
}
}
