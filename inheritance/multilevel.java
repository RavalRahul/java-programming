class base
{
    private int a,b,c;
    protected void fun()
    {
        a=10; b=20;
        c = a+b;
        System.out.println("Sum is : "+c);
    }
}
class deriv extends base{
    private int a,b,c;
    public void fun(int x, int y)
    {
        a=x; b=y;
        c = a/b;
        System.out.println("Div is : "+c);
    }
}
public class multilevel
{
    public static void main(String args[])
    {
        deriv obj = new deriv();
        obj.fun();
        obj.fun(10,5);
    }
}