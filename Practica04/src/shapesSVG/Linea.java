package shapesSVG;

public class Linea{

    /**
     *Atributos
     *@punto1: Las cordendas del punto donde comienza la linea
     *@punto2: Las cordendas del punto donde termina la linea
     *@longitud: La longitud de la linea
     */
    private Vector2 puntoL1;
    private Vector2 puntoL2;
    private double longitud;

    
    /**
     *Metodos
     *@Linea(Vector1, Vector2): Recibe dos vectores y crea una linea a partir de ellos
     *@Linea(): Construcor vacio. Este crea dos  puntos llamados puntoL1 y puntoL2, ambos con cordenadas 0.0, y los usa para crear una linea
     *@Linea(double x1, double y2, double x1, double y2): Crea dos puntos usando los dos primeros valores como X y Y del primero, respectivamente, y los segundos dos valores como X y Y del segundo punto, respectivamente; estos puntos son llamados puntoL1 y PuntoL2 respectivamente y son usados para crear una linea
     *@setPuntoL1: Metodo que recive dos valores X, Y y los asigna a los valorex X, Y del punto de una linea
     *@setPuntoL2: Metodo que recibe dos double y los asigna a los valores X y Y  del punto 2 respectivamente
     *@
     */

    //Constructores
    public Linea(Vector2 puntoL1, Vector2 puntoL2){
	this.puntoL1 = puntoL1;
	this.puntoL2 = puntoL2;
	this.longitud = this.puntoL2.distancia(this.puntoL1);
    }

    public Linea(){
	this.puntoL1 = new Vector2();
	this.puntoL2 = new Vector2();
	this.longitud = this.puntoL2.distancia(this.puntoL1);
    }
    
    public Linea(double x1, double y1, double x2, double y2){
	this.puntoL1 = new Vector2(x1, y1);
	this.puntoL2 = new Vector2(x2, y2);
	this.longitud = this.puntoL2.distancia(this.puntoL1);
    }

    public void setPunto1(double x1, double y1){
	this.puntoL1.setX(x1);
	this.puntoL1.setY(y1);
    }
    
    public void setPunto2(double x2, double y2){
	this.puntoL2.setX(x2);
	this.puntoL2.setY(y2);
    }
    
    public Vector2 getPunto1(){
	return this.puntoL1;
    }
    
    public Vector2 getPunto2(){
	return this.puntoL2;
    }

    public double getLongitud(){
	return this.puntoL2.distancia(this.puntoL1);
    }

    public boolean equals(Linea l){
    	if(this.puntoL1.equals(l.getPunto1()) == true && this.puntoL2.equals(l.getPunto2()) == true){
	    return true;
	}else{
	    return false;
	}
    }

    public String toSVG(){
	return "<svg height='150mm' width='150mm'>" + "\n" + "<line x1='" + puntoL1.getX() + "mm' " + "y1='" + puntoL1.getY() + "mm' " + "x2='" + puntoL2.getX() +"mm' " + "y2='" + puntoL2.getY() + "mm' " + "style='stroke:#000; stroke-width:1mm' />" + "\n" + "</svg>";
    }
    

    public String toString(){
	return "Punto 1: " + this.puntoL1.getX() + " " + this.puntoL1.getY() + " Punto 2: " + this.puntoL2.getX() + " " + this.puntoL2.getY() + " Longitud: " + getLongitud();
    }
    

}
