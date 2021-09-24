class base
{
    private final int a,b;
    {
        a=100;
        b=200;
    }
    public void fun()
    {
        System.out.println(a+" "+b);
    }
}
public class finalk 
{
    public static void main(String args[])
    {
        base b = new base();
        b.fun();
    }
}