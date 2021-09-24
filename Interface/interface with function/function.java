/**
 * function
 */

interface demo{
    static void fun(){
        System.out.println("Hello");
    }
}

class test implements demo {
    
}

public class function {

    public static void main(String[] args) {
        
        test obj = new test();

        obj.fun();

    }
}