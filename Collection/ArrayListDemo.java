import java.util.*;
import java.util.ArrayList;

class ArrayListDemo
{
	public static void main(String[] args)
	{

	int n,i;
	ArrayList Al=new ArrayList();

	Scanner sc=new Scanner(System.in);
	System.out.println("How many Cities to add:");
	n=sc.nextInt();
	
	System.out.println("Enter Cities you want to:");
	for(i=0;i<n;i++)
	{
	 String s=sc.next();
	 Al.add(s);
	}
	System.out.println(Al);

	
	Al.removeAll(Al);
	System.out.println("Cities left after removing: "+Al);
	
	}
}
