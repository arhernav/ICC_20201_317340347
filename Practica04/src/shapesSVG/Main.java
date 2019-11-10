package shapesSVG;
public class Main{
public static void main(String[] args){
    Triangulo t1 = new Triangulo(10.0, 10.0, 20.0, 20.0, 40.0, 10.0);
    Triangulo t2 = new Triangulo(10.0, 10.0, 20.0, 20.0, 30.0, 10.0);
    System.out.println(t1.compareTo(t2));
}
}
