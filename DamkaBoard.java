/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
public static void main(String[] args) {
int a= Integer.parseInt(args[0]);
for (int i=1; i<=a; i++)
  {
  	if (i%2==0)
  		System.out.print(" ");
  	for (int z=0; z<a; z++)
  	{
  		System.out.print(" * ");
  	}
  	System.out.println();
  	
  }

	}
}
