import java.util.Scanner;
abstract class demo
{
    abstract public void fun();
}
class demo2 extends demo{
    private int a,b,c;
    Scanner s = new Scanner(System.in);
    public void fun()
    {
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println(c);
    }
}
public class hello2 {
    public static void main(String args[])
    {
        demo2 d = new demo2();
        d.fun();
    }
}