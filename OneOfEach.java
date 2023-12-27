
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
public static void main (String[] args) {
int a=0;
 int sum=0;
 boolean ifboy=false;
 boolean ifgirl=false;

 while ((ifboy==false)||(ifgirl==false))
 {
 	a= (int)(Math.random()*2);
 	if (a==0)
 	{
 		ifboy=true;
 		System.out.print("b ");
 	}
 	else
 	{
 		ifgirl=true;
 		System.out.print("g ");
 	}
 	sum++;
 }

System.out.println();
System.out.println("You made it... and you now have "+sum+" children.");
	
	}

}
