import java.util.Scanner;
class hello
{
    public static void main(String[] args) 
    {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of element of an array : ");
        n = s.nextInt();
        System.out.println("enter elements of an array : ");
        for(int i=0;i<a.length;i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("You entered elements are : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}