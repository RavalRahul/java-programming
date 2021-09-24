class constclass{
    int a, b;

    constclass(){
        System.out.println("Hello world");
    }

    constclass(int x, int y){
        a=x;
        b=y;
        System.out.println(a+b);
    }

    constclass(constclass obj){
        System.out.println(obj.a);
        System.out.println(obj.b);
    }

}
public class constructordemo {
    public static void main(String[] args) {
        constclass c1 = new constclass();
        constclass c2 = new constclass(10,20);
        constclass c3 = new constclass(c2);
    }
}
