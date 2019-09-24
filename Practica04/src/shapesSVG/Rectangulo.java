package shapesSVG;
/**
*@author: Armando Hernández Navarro
*@param: Crea un rectangulo a partoer de un punto
*@date: 22 de sep del 2019
*/
public class Rectangulo{
    /**
     *Parametros
     *@a: Vector a partir del cual se crea el rectangulo
     *@ancho: Longitud del ancho del rectangulo
     *@alto: Longitud de la altura del rectangulo
     *@perimatro: Valor de el perimetro del rectanulo
     *@area: Valor del area del rectangulo
     */
    private Vector2 a;
    private double ancho;
    private double alto;
    private double perimetro;
    private double area;


    /**
     *Metodos
     *@Rectangulo(Vector2, double, double)
     *Construye un objeto de clase rectangulo usando un vector2 y dos double que usa como ancho y alto del rectangulo respectivamente
     *@Rectangulo(double, double, double, double)
     *Construye un Vector2 llamado "a" tomando los primeros dos valores dados como las cordenadas X y Y, a partir de ese punto crea un objeto de clase Rectangulo tomando  el tercer y cuarto valor como ancho y alto  respectivamente
     *@Rectangulo()
     * Crea un Vector2 llamado a con cordenadas 0.0 y, a partir de esas dos cordenadas, crea un objeto de la clase rectangulo con ancho de 0.0 y alto de 0.0
     *@toString
     *Convierte a String los valores del Rectangulo
     */

    //Constructores
    public Rectangulo(Vector2 a, double ancho, double alto){
	this.a = a;
	this.ancho = ancho;
	this.alto = alto;
	this.perimetro = (this.ancho * 2) + (this.alto * 2);
	this.area = this.ancho * this.alto;
    }
    public Rectangulo(double x, double y, double ancho, double alto){
	this.a = new Vector2(x, y);
	this.ancho = ancho;
	this.alto = alto;
	this.perimetro = (this.ancho * 2) + (this.alto * 2);
	this.area = this.ancho * this.alto;
    }
    public Rectangulo(){
	this.a = new Vector2();
	this.ancho = 0.0;
	this.alto = 0.0;
	this.perimetro = (this.ancho * 2) + (this.alto * 2);
	this.area = this.ancho * this.alto;
    }

    //Setter y getters
    public void setA(double x, double y){
	this.a.setX(x);
	this.a.setY(y);
    }
    public void setAncho(double n){
	this.ancho = n;
    }
    public void setAlto(double m){
	this.alto = m;
    }
    public Vector2 getA(){
	return this.a;
    }
    public double getAncho(){
	return this.ancho;
    }
    public double getAlto(){
	return this.alto;
    }
    public double getPerimetro(){
	return this.perimetro = (this.ancho * 2) + (this.alto * 2);
    }
    public double getArea(){
	return this.area = this.ancho * this.alto;
    }

    //toSVG, toString e equals
    public String toSVG(){
	return "<svg height='150mm' width='150mm'>" + "\n" + "<rect width='" + this.ancho + "mm' " + "height='" + this.alto + "mm' " + "rx='" + a.getX() + " ry='" + a.getY() + "mm' " + "style='fill: purple; stroke: pink; stroke-width: 1mm;'/>" + "\n" + "</svg>";
    }



    public String toString(){
	return "Punto a:(" + this.a.getX() + ", " + this.a.getY() + ") " + "Anchura: " + this.ancho + " Altura: " + this.alto;
    }

    public boolean equals(Rectangulo r){
	if(this.a.equals(r.getA()) == true && this.ancho == r.getAncho() && this.alto == r.getAlto()){
	    return true;
	}else{
	    return false;
	}
    }


}
