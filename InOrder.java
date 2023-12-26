/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
public static void main (String[] args) {
int max=0;
int random = (int) (Math.random() * 10);
while (max<10)
{
	if (max < random)
	{
		System.out.println(random);
		max=random;
	}
  random = (int) (Math.random() * 10);
}
}
}
