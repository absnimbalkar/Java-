import java.io.*;
import java.lang.String.*;

class Ass3_seta1 extends Thread
{
            String msg="";
                        int  n;
                        Ass3_seta1(String msg,int n)
                        {
                                    this.msg=msg;
                                                this.n=n;
                        }
            public void run()
            {
                        try
                        {           for(int i=1;i<=n;i++)
                                    {
                                                System.out.println(msg+" "+i+" times");
                                    }
                                    System.out.println("\n ");
                        }
                        catch(Exception e){}
            }
}
class multithreading
{
            public static void main(String a[])
            {
                        int n=Integer.parseInt(a[0]);
                                    Ass3_seta1 t1=new Ass3_seta1("COVID19",n);
                                    t1.start();
                                    Ass3_seta1 t2=new Ass3_seta1("LOCKDOWN2020",n+10);
                                    t2.start();
                                    Ass3_seta1 t3=new Ass3_seta1("VACCINATED2021",n+20);
                                    t3.start();
            }
}

