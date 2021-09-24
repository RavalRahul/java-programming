class demo1{
    int a = 10;
    void fun(){
        int a = 20;
        System.out.println(this.a);
    }
}

public class scopedemo {
    public static void main(String[] args) {
        demo1 d1 = new demo1();
        d1.fun();
    }
}
