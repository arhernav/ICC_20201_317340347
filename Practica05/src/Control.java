import java.util.ArrayList;
import java.util.Arrays;

/**
 *Clase que contiene metodos aplicables a arreglos
 *@author Armando Hernández
 *
 */

public class Control{

    /**
     *Te permite saber si la palabra recibida es un palindromo o no
     *@param Palabra. recibe una paabra
     */
    public static boolean problema1(String palabra){
	String inversa = "";
	for (int i = palabra.length()-1; i>=0; i--){
	    inversa += palabra.charAt(i);
	}
	if (palabra.equals(inversa)){
	    return true;
	}else{
	    return false;
	}
    }
    
    public static boolean problema2(int[] arreglo, int k){
        return false;
    }
    
    public static void problema3(int[] arreglo){
	for(int i = 0; i< arreglo.length-1; i++){
	    for(int d = 0; d < arreglo.length -i -1; d++){
		if(arreglo[d] > arreglo[d+1]){
		    int supp = arreglo[d];
		    arreglo[d] = arreglo[d+1];
		    arreglo[d+1]=supp;
		}
	    }
	}
    }
    
    public static boolean problema4(int[] arreglo, int buscando){
        return true;
    }

    public static boolean problema5(int n){
        if(n == 1) return false;
        for(int i = 2; i<n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
    
    //public static int[] problema6(int n){
	
    //}


    public static void main(String[] args) {
        String resultado = "";
        int[] desordenado = {9,8,7,6,5,4,3,2,1};
        int[] ordenado    = {1,2,3,4,5,6,7,8,9};
        int[] primos10 = {2,3,5,7};
        if(problema1("oso")==true && problema1("palabra")==false)resultado+="P1 bien\n";else resultado+="P1 mal\n";
        if(problema2(desordenado, 17)==true) resultado+="P2 bien\n";else resultado+="P2 mal\n";
        problema3(desordenado);
        if(Arrays.equals(desordenado,ordenado) == true)resultado+="P3 bien\n";else resultado+="P3 mal\n";
        if(problema4(desordenado,2)== true && problema4(desordenado,18)== false)resultado+="P4 bien\n";else resultado+="P4 mal\n";
        if(problema5(7)==true && problema5(6)==false)resultado+="P5 bien\n";else resultado+="P5 mal\n";
        //if(Arrays.equals(problema6(10), primos10) == true)resultado+="P6 bien\n";else resultado+="P6 mal\n";
        System.out.println(resultado);   
    }

}
