import java.util.Scanner;
abstract class base
{
    abstract public void fun();
}
class deriv extends base
{
    private int a,b,c;
    Scanner s = new Scanner(System.in);
    public void fun() 
    {
        a = s.nextInt();
        b = s.nextInt();
        c=a+b;
        System.out.println(c);
    }
}
public class hello
{
    public static void main(String args[])
    {
        deriv obj = new deriv();
        obj.fun();
    }
}