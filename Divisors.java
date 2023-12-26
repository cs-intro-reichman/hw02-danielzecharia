/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
public static void main (String[] args) {
	int x = Integer.parseInt(args[0]);
	System.out.println("1");
	int d = 2;
	for (int i = 0; i<x; i++ )
	{
		if (x%d==0)
			System.out.println(d);
		d++;
	}
		
}
}
