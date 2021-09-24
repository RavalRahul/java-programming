interface animal{
    public void eat();
    public void travel();
}

class fun implements animal{
    public void demo(){
        System.out.println("this is demo");
    }
    public void eat(){
        System.out.println("this is eat");
    }

    public void travel(){
        System.out.println("this is travel");
    }
}

public class interfacedemo {
    public static void main(String[] args) {
        fun f1 = new fun();
        f1.demo();
        f1.eat();
        f1.travel();
    
    }
}
