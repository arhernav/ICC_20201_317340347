package shapesSVG;
public class Main{
public static void main(String[] args){
    Vector2 okcomputer = new Vector2(100.0, 100.0);
    Linea revolver = new Linea(2.0, 10.0, 50.0, 10.0);
    Triangulo inuendo = new Triangulo(2.0, 20.0, 30.0,  20.0, 15.0, 40.0);
    Rectangulo xinfinity = new Rectangulo(15.0, 50.0,  70.0, 30.0);
    Circulo terraformer = new Circulo(70.0, 70.0, 40.0);

    System.out.println(okcomputer.toSVG());
    System.out.println("\n");
    System.out.println(revolver.toSVG());
    System.out.println("\n");
    System.out.println(inuendo.toSVG());
    System.out.println("\n");
    System.out.println(xinfinity.toSVG());
    System.out.println("\n");
    System.out.println(terraformer.toSVG());
    System.out.println("\n");
    
}
}
