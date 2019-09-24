package shapesSVG;

/**
 *Construye un triangulo en un plano
 *@author: Armando Hernández Navarro
 *
 */
public class Triangulo{

    /**
     *Atributos
     *@a:Vector del primer punto de triangulo
     *@b:Vector del segundo punto del triagulo
     *@c:Vector del tercer punto del triangulo
     *@perimetro: Valor del perimetro del triangulo
     *@area:Valor del area del triangulo
     */
    private Vector2 a;
    private Vector2 b;
    private Vector2 c;
    private double perimetro;
    private double area;
    private double semiperimetro;

    
    /**
     *Metodos
     *
     */
    public Triangulo(Vector2 a, Vector2 b, Vector2 c){
	this.a = a;
	this.b = b;
	this.c = c;
	this.perimetro = this.a.distancia(b) + this.b.distancia(c) + this.c.distancia(a);
	
	this.semiperimetro = (this.a.distancia(b) + this.b.distancia(c) + this.c.distancia(a)) / 2 ;
	
	this.area = Math.sqrt(this.semiperimetro * (this.semiperimetro - this.a.distancia(this.b)) * (this.semiperimetro - this.b.distancia(this.c)) * (this.semiperimetro - this.c.distancia(this.a)));
    }
    public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3 ){
	this.a = new Vector2(x1, y1);
	this.b = new Vector2(x2, y2);
	this.c = new Vector2(x3, y3);
	this.perimetro = this.a.distancia(b) + this.b.distancia(c) + this.c.distancia(a);
	this.semiperimetro = (this.a.distancia(b) + this.b.distancia(c) + this.c.distancia(a)) / 2 ;
	this.area = Math.sqrt(this.semiperimetro * (this.semiperimetro - this.a.distancia(this.b)) * (this.semiperimetro - this.b.distancia(this.c)) * (this.semiperimetro - this.c.distancia(this.a)));
    }
    public Triangulo(){
	this.a = new Vector2();
	this.b = new Vector2();
	this.c = new Vector2();
	this.perimetro = this.a.distancia(b) + this.b.distancia(c) + this.c.distancia(a);
	this.semiperimetro = (this.a.distancia(b) + this.b.distancia(c) + this.c.distancia(a)) / 2 ;
	this.area = Math.sqrt(this.semiperimetro * (this.semiperimetro - this.a.distancia(this.b)) * (this.semiperimetro - this.b.distancia(this.c)) * (this.semiperimetro - this.c.distancia(this.a)));
    }
    
    


    /**
     *Metodos
     */
    //Setters
    public void setA(double x, double y){
	this.a.setX(x);
	this.a.setY(y);
    }
    public void setB(double x, double y){
	this.b.setX(x);
	this.b.setY(y);
    }
    public void setC(double x, double y){
	this.c.setX(x);
	this.c.setY(y);
    }

    //Getters
    public double getPerimetro(){
	return this.perimetro;
    }
    public double getSPerimetro(){
	return this.semiperimetro;
    }
    public double getArea(){
	return  Math.sqrt(this.semiperimetro * (this.semiperimetro - this.a.distancia(this.b)) * (this.semiperimetro - this.b.distancia(this.c)) * (this.semiperimetro - this.c.distancia(this.a)));
    }
    public Vector2 geta(){
	return this.a;
    }
    public Vector2 getb(){
	return this.b;
    }
    public Vector2 getc(){
	return this.c;
    }

    //toString, toSVG, equals
    public String toSVG(){
	return "<svg height='150' width='150'>" + "\n" + "<polygon points='" + this.a.getX() + "," + this.a.getY() + " " + this.b.getX() + "," + this.b.getY() + " " + this.c.getX() + "," + this.c.getY() + "' style='fill:lime;stroke:purple;stroke-width:1' />" + "\n" + "</svg>";
    }
    public String toString(){
	return "Triangulo con puntos" + "\n" + "a:(" + this.a.getX() + ", " + this.a.getY() + ")" + "\n" + "b:(" + this.b.getX() + ", " + this.b.getY() + ")" + "\n" + "c:(" + this.c.getX() + ", " + this.c.getY() + ")" + "\n" + "area: " + getArea() + " perimetro: " + getPerimetro();
    }
    public boolean equals(Triangulo t){
	if(this.a == t.geta() && this.b == t.getb() && this.c == t.getc()){
	    return true;
	}else{
	    return false;
	}
    }

    

}



