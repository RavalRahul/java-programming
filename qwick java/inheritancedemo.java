class x{
    void fun1(){
        System.out.println("this is class x");
    }
}

class y extends x{
    void fun2(){
        System.out.println("this is class y");
    }
}

class z extends x{
    void fun3(){
        System.out.println("this is class z");
    }
}

public class inheritancedemo {
    public static void main(String[] args) {
        y y1 = new y();
        z z1 = new z();

        y1.fun1();
        z1.fun1();
    }    
}
