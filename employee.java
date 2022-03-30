import java.util.*;
class employee
{
    int id; String nm; String deptnm ; float sal; static int cnt;
    
    {
        id =0 ;sal = 0;

    }
    employee(int id , String nm , String deptnm , float sal)
    {
        this.id = id;
        this.nm = nm;
        this.deptnm = deptnm;
        this.sal  = sal;
    }
    void display()
    {
        cnt++;
        System.out.println("Object is created : " + cnt);
        System.out.println("id : " + id + "\t Name : " + nm + "\t Deptnm : " + deptnm + "\t sal : " + sal);
    }
    public static void main(String args[])
    {
        Scanner s1 = new Scanner(System.in);
	System.out.println("Number of objects you want to create");
	int n=s1.nextInt();
	for(int i=1;i<=n;i++)
	
	{

        System.out.println("\n Enter id , name ,deptnm and sal");
        int id = s1.nextInt();
        String nm = s1.next();
        String deptnm = s1.next();
        float sal = s1.nextFloat();
        employee e1 = new employee(id,nm , deptnm , sal);
        e1.display();
	}
    }

}
