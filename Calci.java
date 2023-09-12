import java.util.Scanner;
interface Calci{
int add(int a,int b);
}

class  CalciImp implements Calci
{
  int add(int x,int y )
{
return x+y;
}
}
public class CalciDev
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter any Two Numbers");
int n1=s.nextInt();
int n2=s.nextInt();
CalciImp c=new CalciImp();
System.out.println("The Result is"+c.add(n1,n2));
}
}
