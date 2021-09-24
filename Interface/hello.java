interface A
{
    void i1();
}
interface B 
{
    void i2();
}
interface C extends A,B
{

}
class D implements C
{
    public void i1()
    {
        System.out.println("i1");
    }
    public void i2()
    {
        System.out.println("i2");
    }
    public void c1()
    {
        System.out.println("c1");
    }
}
public class hello
{
    public static void main(String args[])
    {
        D o = new D();
        o.i1();
        o.i2();
        o.c1();
    }
}