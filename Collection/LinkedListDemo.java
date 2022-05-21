import java.util.*;

class LinkedListDemo

{
	public static void main(String[] args)
	{
	int n,i;
	LinkedList<String> Al=new LinkedList<String>();

	Scanner sc=new Scanner(System.in);
	System.out.println("How many Friends to call:");
	n=sc.nextInt();
	
	System.out.println("Enter your Friends: ");
	for(i=0;i<n;i++)
	{
	 String s=sc.next();
	 Al.add(s);
	}
	
	System.out.println(Al);
	
	}
}


