/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
public static void main (String[] args){
String a = args[0];
int n = a.length()-1;
for (int i = 0; i < a.length(); i++)
{
	System.out.print(a.charAt(n));
	n--; 
}
System.out.println ();
int middle =  a.length();
if(middle%2==0)
	System.out.println( "The middle Character is "+ a.charAt(middle/2-1) );
else
	System.out.println( "The middle Character is "+ a.charAt(middle/2) );
		//// Put your code here
}
}
