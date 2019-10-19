/**
 *@author Armando Hernández Navarro
 *@date 15 oct 2019
 *Clase Matrix crea una matriz de n por m columnas y permite manipularlas
 */
public class Matrix{

    

    //Paramteros
    /**
     *@m Numero de filas
     */
    private int m;
    
    /**
     *@n Numero de columnas
     */
    private int n;
    
    /**
     *@graf Interpretacion grafica de Matrix hecha como un arreglo bidimensional
     */
    private double[][] graf;

    //Metodos
    /**
     *@getM Regres el numero de filas
     */
    public int getM(){
	return this.m;
    }

    /**
     *@getN Regrsa el numero de filas
     */
    public int getN(){
	return this.n;
    }

    /**
     *Construye una matriz vacia de n por m
     */
    public Matrix(int n, int m){
	this.n = n;
	this.m = m;
	this.graf = new double[this.n][this.m];
    }
    
    /**
     *Construye una matriz dado un arreglo
     */
    public Matrix(double[][] array){
	this.n = array.length;
	this.m = array[0].length;
	this.graf = new double[this.n][this.m];
	for(int i = 0; i<this.n; i++){
	    for(int j = 0; j <this.m; j++){
		this.graf[i][j] = array[i][j];
	    }
	}
    }

    /**
     *Función que calcula producto escalar
     */
    public void scalarProduct(double scalar){
	for(int i = 0;i < this.m; i++){
	    for(int j = 0; j < this.n; j++){
		this.graf[i][j] = this.graf[i][j] * scalar;
	    }
	}
    }

    /**
     *Función que calcula suma de matrices
     */
    public void add(Matrix m){
	if(this.m == m.getM() && this.n == m.getN()){
	    for(int i = 0; i < this.m; i++){
		for(int j = 0; j < this.n; j++){
		    this.graf[i][j] += m.getElement(i, j);
		}
	    }
	}
    }
    
    /**
     *Función que calcula producto de matrices
     */
    public void matrixProduct(Matrix m){
	if(this.n != m.getM()){
	    System.out.println("No se puedenmultiplicar");
	}
	Matrix resultado = new Matrix(this.m, m.getN());
	for(int i = 0; i < resultado.getM(); i++){
	    for(int j = 0;  j < resultado.getN(); j++){
		for(int k = 0; k< this.n; k++){
		    resultado.setElement(i, j, (this.graf[i][j] * m.getElement(k, j)));
		}
	    }
	}
    }

    /**
     *@getElement Regresa el valor que se encuentra en la fila i y columna indicada
     */
    public double getElement(int i, int j){
	return this.graf[i][j];
    }
    
    /**
     *function set element le asigna un valor e a la casilla de la fila i y columna j
     */
    public void setElement(int i, int j,double e){
	graf[i][j] = e;
    }
    
    /**
     *Función que calcula el determinante si es nxn
     */
    public int determinant(){return 0;}
    
    /**
     *Función que te dice si 2 matrices son iguales
     */
    
    public boolean equals(Matrix o){
	boolean si = true;
	if(this.m == o.getM() && this.n == o.getN()){
	    for(int i = 0; i < this.m; i++){
		for(int j = 0; j < this.n; j++){
		    if(graf[i][j] != o.getElement(i, j)){
			si = false;
		    }
		}
	    }
	    return si;
	}else{
	    return false;
	}
    }
}
