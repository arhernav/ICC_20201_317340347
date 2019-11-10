package shapesSVG;
public class Main{
public static void main(String[] args){
    Rectangulo r1 = new Rectangulo(10.0, 10.0, 30.0, 20.0);
    Rectangulo r2 = new Rectangulo(10.0, 10.0, 20.0, 20.0);
    System.out.println(r1.compareTo(r2));
}
}
