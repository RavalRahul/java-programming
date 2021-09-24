
class box{
    double width=1;
    double height=2;
    double depth=3;
    void volume(){
        System.out.print("Volume is ");
        System.out.println(width*height*depth);
    }
}
public class demo {
    public static void main(String[] args) {
        box b1 = new box();
        b1.volume();
    }
}
