import java.util.*;

class HashTableDemo

{
	public static void main(String[] args)
	{
	int n,i;
	Hashtable<String,Integer> Al=new Hashtable<String,Integer>();

	Scanner sc=new Scanner(System.in);
	System.out.println("How many Student and their Mobile No. to enter:");
	n=sc.nextInt();
	
	for(i=0;i<n;i++)
	{
	 System.out.println("Enter Student Name & MobileNo: ");

	 String s=sc.next();
	 int t=sc.nextInt();
	 Al.put(s,t);
	}
	System.out.println(Al);
	
	}
}


