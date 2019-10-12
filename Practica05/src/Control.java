import java.util.ArrayList;
import java.util.Arrays;

/**
 *Clase control
 *
 *Clase que contiene metodos aplicables a arreglos
 *
 *@author Armando Hernández
 *
 *@date 11/10/19
 */

public class Control{

    /**
     *Te permite saber si la palabra recibida es un palindromo o no
     *@param Palabra. recibe una paabra
     *@return Regresa true si es un palindromo, false en otro caso
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

    /**
     *Te indica si hay dos numeros en el arreglo que sumen un numero seleccionado
     *
     *@param K. Recibe un numero K y busca en el arreglo si existen dos numeros que sumen K
     *
     *@return Regresa true si en el arreglo existen dos numeros que sumen K. False en otro caso
     */
    
    public static boolean problema2(int[] arreglo, int k){
	int aux = 0;
	for(int i = 0; i < arreglo.length; i++){
	    for(int j = 0; j < arreglo.length; i++){
		aux = arreglo[i] + arreglo[j];
		if(aux == k){
		    return true;
		}else{
		    aux = 0;
		}
	    }
	}
        return false;
    }
    
    /**
     *Recibe un arreglo ordenado y devuelve el mismo arreglo pero ordenado
     *
     *@param arreglo. recibe un arreglo desordenado
     *
     *@return Devuelve un arreglo ordenado
     */
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

    /**
     *Recibe un arreglo ordenado y un numero. Regresa true si el numero recibido se encuentra en el arreglo, false en otro caso
     *
     *@param Recibe un arreglo ordenado y un numero 
     *
     *@return Regresa true si el numero recibido se encuentra en el arreglo ordenado
     */
    public static boolean problema4(int[] arreglo, int buscando){
	int medio;
	int maximo = arreglo.length -1;
	int minimo = 0;
	while(minimo <= maximo){
	    medio = (maximo + minimo)/2;
	    if(arreglo[medio] == buscando){
		return true;
	    }else{
		if(buscando < arreglo[medio]){
		    maximo = medio - 1;
		}else{
		    minimo = medio + 1;
		}
	    }
	}
        return false; 
    }

    /**
     *Recibe un numero e indica si el numero es primo o no
     *
     *@param N. Recibe un numero N e indica si este es primo o no
     *
     *@return Regresa true si el numero recibido es primo, false en otro caso
     */
    public static boolean problema5(int n){
        if(n == 1) return false;
        for(int i = 2; i<n;i++){
            if(n%i==0)return false;
        }
        return true;
    }

    /**
     *Recibe un numero N y regresa una liste con todos los numeros primos menores a N
     */
    public static int[] problema6(int n){
	ArrayList<Integer> primos = new ArrayList<Integer>();
	for(int i = 0; i<n; i++){
	    if(problema5(i) == true){
		primos.add(i);
	    }
	}
	int [] arPrimos = new int[primos.size()];
	for(int j =0; j < arPrimos.length;j++){
	    arPrimos[j] = primos.get(j);
	}
	return arPrimos;
    }


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
        if(Arrays.equals(problema6(10), primos10) == true)resultado+="P6 bien\n";else resultado+="P6 mal\n";
        System.out.println(resultado);   
    }

}
