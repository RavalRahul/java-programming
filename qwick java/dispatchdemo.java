// import jdk.javadoc.internal.doclets.toolkit.taglets.SystemPropertyTaglet;

class dis1 {
    void fun1(){
        System.out.println("dis1 fun1");
    }

    void fun2(){
        System.out.println("dis1 fun2");
    }
}
class dis2 extends dis1{
    void fun3(){
        System.out.println("dis2 fun3");
        }

        void fun2(){
                System.out.println("dis2 fun2");
            } 
}
public class dispatchdemo {
    public static void main(String[] args) {
        dis1 obj  = new dis2();

        obj.fun1();
        obj.fun2();
        obj.fun3();


    }
}
