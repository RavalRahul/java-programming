class base
{
    private int a;
    public void fun(int a)
    {
        this.a=a;
        System.out.println("number is : "+a);
    }
}
public class thisk
{
    public static void main(String args[])
    {
        base b1 = new base();
        b1.fun(10);
    }
}