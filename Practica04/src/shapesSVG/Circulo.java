package shapesSVG;

/**
 *@author: Armando Hernández Navarro
 *@version:1.0
 *@date: 23 de sep del 2019
 */

public class Circulo{
    /**
     *Parametros
     *@centro: Vector donde se ubica el centro del circulo
     *@radio: Valor del radio del circulo
     *@perimetro:Valor del perimetro del circulo
     *@area:Valor del area del circulo
     */
    private Vector2 centro;
    private double radio;
    private double perimetro;
    private double area;

    /**
     *Metodos
     *@Circulo(Vector2, double): Construye un circulo usando las cordenadas del vector como centro del circulo y el valor de double como su radio
     *@Circulo(double, double, double):Construye un Vector2, llamado centro,con los primeros dos valores de double como X y Y respectivamente. A partir de ese Vector2 crea un circulo usando el ultimo double como radio
     *@Circulo():Construye un punto llamado centro con cordenadas (0.0, 0.0) y a partir de ellas crea un circulo con radio 0
     *@setcentro: Le asigna nuevas cordenadas X, Y al centro de un circulo
     *@setradio: Le asigna un nuevo valor al radio del circulo
     *@getcentro: Da las cordenadas del Vector2 usado por el circulo como centro
     *@getradio: Da el valor del radio del circulo
     *@getarea: Da el valor del area del circulo
     *@getperimetro: Da el valor del perimetro del circulo
     *@tosvg: Convierte el circulo a SVG
     *@tostring: Convierte el circulo a String
     *@equals: Compara dos circulos y regresa true si son iguales, false en otro caso
     */

    //Constructores
    public Circulo(Vector2 centro, double radio){
	this.centro = centro;
	this.radio = radio;
        this.perimetro = this.radio * (2 * 3.1416);
	this.area = Math.pow(this.radio, 2) * 3.1416;
    }
    public Circulo(double x, double y, double radio){
	this.centro = new Vector2(x, y);
	this.radio = radio;
        this.perimetro = this.radio * (2 * 3.1416);
	this.area = Math.pow(this.radio, 2) * 3.1416;	
    }
    public Circulo(){
	this.centro = new Vector2();
	this.radio = 0.0;
	this.perimetro = this.radio * (2 * 3.1416);
	this.area = Math.pow(this.radio, 2) * 3.1416;
    }

    //Setters
    public void setCentro(double x, double y){
	this.centro.setX(x);
	this.centro.setY(y);
    }
    public void setRadio(double c){
	this.radio = c;
    }

    //Getters
    public Vector2 getCentro(){
	return this.centro;
    }
    public double getRadio(){
	return this.radio;
    }
    public double getArea(){
	return this.area = Math.pow(this.radio, 2) * 3.1416;
    }
    public double getPerimetro(){
	return this.perimetro = this.radio * (2 * 3.1416);
    }

    //toString, toSVG, equals
    public String toSVG(){
	return "<svg height='150' width='150'>" + "\n" + "<circle cx='" + this.centro.getX() + "' " + "cy='" + this.centro.getY() + "' " + "r='" + this.radio +"' " + "stroke='black' stroke-width='3' fill='red' />" + "\n" + "</svg>"; 
    }
    public String toString(){
	return "Circulo con centro en (" + this.centro.getX() + ", " + this.centro.getY() + ") y radio de: " + this.radio + "\n" + "Area=" + getArea() + "\n" + "Perimetro= " + getPerimetro();
    }
    public boolean equals(Circulo c){
	if(this.centro.equals(c.getCentro()) && this.radio == c.getRadio()){
	    return true;
	}else{
	    return false;
	}
    }


}
