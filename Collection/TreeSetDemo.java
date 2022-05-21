import java.util.*;

class TreeSetDemo
{

	public static void main(String[] args)
	{
		Set al=new TreeSet();
		int choice,i,n;
		Scanner sc=new Scanner(System.in);

		do
		{
		 System.out.println("enter your choice: ");
		 choice=sc.nextInt();
		 switch(choice)
			{
			case 1:
					System.out.println("how many colors: ");
					n=sc.nextInt();
					for(i=1;i<=n;i++)
						{
							System.out.println("enter colors name : "+i);
							String input=sc.next();
							al.add(input);
						}
						
					break;

			case 2:

						System.out.println(al);				
						break;
			}
		}while(choice!=3);
		
	}
}
