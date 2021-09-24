abstract class car{
    abstract public void carColor();
    abstract public void carBreak();
}

class supercar extends car{
    public void carColor(){
        System.out.println("red");
    }
    public void carBreak(){
        System.out.println("this is a break of red colored car");
    }
}
public class abstractdemo {
    
    public static void main(String[] args) {
        supercar s1 = new supercar();
        s1.carBreak();
        s1.carColor();
    }
}
