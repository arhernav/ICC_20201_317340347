package shapesSVG;
 /**
 *Vector2 Crea un punto en el espacio
 *@author:Arhernav
 *@date: 17 sep 2019
 */

public class Vector2{
    /**
     *Paramtros
     *@x:Valor del eje x para el punto
     *@y:Valor del eje y para el punto
     *@magnitud:Da la distancia entre el punto creado y el ponto (0,0) en el plano
     */
    
    private double x;
    private double y;
    private double magnitud;


    /**metodos
     *@Vector2:Construye un punto en el plano con las cordenadas que se le indiquen
     *Las cordenadas son double, double
     *@Vector2: Construye un punto con cordenadas 0.0, 0.0
     *@setX:asigna un valor para la cordenada X
     *@setY:Asigna un valor para la cordenada Y
     *@getX: Indica el valor de la cordenada X
     *@getY: Indica el valor de la cordenada Y
     *@getMag: Indica el valor de la magnitud de un punto
     *@distancia:Indica la distancia entre dos puntos
     *@equals: Regresa "True" cuando dos puntos son igules; "False" en otro caso
     *@toString: Regres todos los valores de un punto convertidos a string
     */
    
    //constructor1
    public Vector2(double x, double y){
	this.x = x;
	this.y = y;
	this.magnitud = Math.sqrt(Math.pow(this.x, 2.0) + Math.pow(this.y, 2.0));
	}
    //constructor 2
    public Vector2(){
	this.x = 0.0;
	this.y = 0.0;
	this.magnitud = Math.sqrt(Math.pow(this.x, 2.0) + Math.pow(this.y, 2.0));
    }

    //Setters
    public void setX(double x){
	this.x = x;
    }
    public void setY(double y){
	this.y = y;
    }
    //getters
    public double getX(){
	return this.x;
    }
    public double getY(){
	return this.y;
    }
    public double getMag(){
	return this.magnitud;
    }

    //Metodos
    public double distancia(Vector2 v){
	return Math.sqrt(Math.pow((this.x - v.getX()), 2) + Math.pow((this.y - v.getY()), 2));
    }

    public boolean equals(Vector2 v){
	if(this.x == v.getX() && this.y ==v.getY()){
	    return true;
	}else{
	    return false;
	}
    }
    
    //To string y to to rgv

    public String toString(){
	return "Cordenada x: " + x + "\n" + "Cordenada y: "+ y + "\n" + "Magnitud o distancia desde el 0: " + magnitud;
    }

    public String toSVG(){
	return "<svg height='150mm' width='150mm'>" +"\n" + "<circle cx='" + this.x + "mm' " + "cy='" + this.y + "mm' " + "r='0.5mm' stroke='black' stroke-width='0.5mm' fill='black' />" + "\n" + "</svg>";
    }
    

}


