final class a{
    final public void fun1(){
        System.out.println("This is fun1");
    }
}

class b extends a{
    public  void fun1(){
        System.out.println("This is fun1");
    }
}

public class finaldemo {
    public static void main(String[] args) {
        b b1 = new b();
        b1.fun1();
    }
}
