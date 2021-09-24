class sumclass{
    void sum (int a, int b){
        System.out.println(a+b);
    }

    void sum (int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class overloadingdemo {
    public static void main(String[] args) {
        sumclass s1 = new sumclass();
        s1.sum(10,20);
        s1.sum(10,20,30);
    }    
}
