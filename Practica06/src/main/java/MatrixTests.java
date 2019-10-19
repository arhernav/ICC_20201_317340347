public class MatrixTests{
    
    public static void scalarProduct_test(Matrix m){
	boolean bien = true;
        m.scalarProduct(2.0);
	for(int i = 0; i < m.getM(); i++){
	    for(int j = 0; j < m.getN(); j++){
		if(m.getElement(i, j) != 4){
		    bien = false;
		}
	    }
	}
	if(bien == true){
	    System.out.println("Scalar product Succes");
	}else{
	    System.out.println("Scalar product falied");
	}
    }
    
    public static void add_test(Matrix m, Matrix n){
	m.setElement(2, 2, 2.0);
	n.setElement(4, 4, 4.0);
	m.add(n);
	if(m.getElement(2, 2) == 2.0 && m.getElement(4, 4) == 4.0){
	    System.out.println("addition: Succes");
	}else{
	    System.out.println("addition failed");
	}
	m.setElement(2, 2, 0);
	n.setElement(4, 4, 0);
    }
    
    public static void matrixProduct_test(Matrix m,Matrix n){
	System.out.println("Matrix product: ??");
    }
    
    public static void setElement_test(Matrix m){
	m.setElement(2, 2, 2.0);
	if(m.getElement(2, 2) == 2.0){
	    System.out.println("setElement: succes");
		}else{
	    System.out.println("setElement failed");
	}
	m.setElement(2, 2, 0);
    }
    
    public static void getElement_test(Matrix m){
	m.setElement(2, 2, 2.0);
	if(m.getElement(2, 2) == 2.0){
	    System.out.println("Get element: Succes");
	}else{
	    System.out.println("Get element failed");
	}
	m.setElement(2, 2, 0);
    }
    
    public static void determinant_test(){
        System.out.println("Determinant failed");
    }
    
    public static void equals_test(Matrix m, Matrix n){
	if(m.equals(n) == false){
	    System.out.println("equals: Succes");
	}else{
	    System.out.println("equals failed");
	}
	m.setElement(0, 0, 0);
	n.setElement(0, 0, 0);
    }

    public static void main(String[] args) {
	Matrix prueba = new Matrix(5, 5);
	Matrix p = new Matrix(5, 5);
	Matrix val = new Matrix(5, 5);
	for(int i = 0; i < val.getM(); i++){
	    for(int j = 0; j < val.getN(); j++){
		val.setElement(i,j,2);		
	    }
	}
        scalarProduct_test(val);
        add_test(prueba, p);
        matrixProduct_test(prueba, p);
        setElement_test(prueba);
        getElement_test(prueba);
        determinant_test();
        equals_test(p, prueba);
    }
}
