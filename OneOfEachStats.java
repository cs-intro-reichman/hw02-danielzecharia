import java.util.Random;
public class OneOfEachStats {
public static void main (String[] args) {
int t= Integer.parseInt(args[0]);
int seed = Integer.parseInt(args[1]);
Random generator = new Random(seed); 
 int n4=0, n2=0,n3=0, sum=0,kids=0;
 boolean ifboy=false;
 boolean ifgirl=false;
 double rnd;
 
 

 for( int i=0; i<t; i++)
 {
	while ((ifboy==false)||(ifgirl==false))
 {
 	rnd = generator.nextDouble();
 	if (rnd<0.5)
 	{
 		ifboy=true;
 	}
 	else
 	{
 		ifgirl=true;
 	}
 		
 	sum++;
 	kids++;
 }
 
 if (kids==2)
 {
 	n2++;
 }
 else
 {
 	if (kids==3)
 	{
 		n3++;
 	}
 	else
 	{
 		n4++;
 	}
 }
 ifboy=false;
 ifgirl=false;
 kids=0;

 }
 System.out.println("Average: "+((double)sum/t)+" children to get at least one of each gender.");
 System.out.println("Number of families with 2 children: "+n2);
 System.out.println("Number of families with 3 children: "+n3);
 System.out.println("Number of families with 4 children: "+n4);
 if(n1>n2)
 {
 	System.out.println("The most common number of children is 1.");
 }
 else
 {
 	if(n2>n3)
 	{
 		System.out.println("The most common number of children is 2.");
 	}
 	else
 		System.out.println("The most common number of children is 3.");

 }


		


		    
	}
}
