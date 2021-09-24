class base
{
    protected int x=10;
}
class deriv extends base
{
    private int x=20;
    public void fun(int x)
    {
        int a,b,c;
        a=super.x;
        b=this.x;
        c=x;
        System.out.println("Base : "+a);
        System.out.println("Deriv : "+b);
        System.out.println("Fun : "+c);
    }
}
public class superk
{
    public static void main(String args[])
    {
        deriv d = new deriv();
        d.fun(30);
    }
}