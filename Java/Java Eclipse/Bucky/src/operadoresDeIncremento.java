import java.util.Scanner;

public class operadoresDeIncremento {
	public static void main(String args[]){//Metodo Main que marca el inicio de la aplicacion java.
        Scanner variableAlmacenEscaneo = new Scanner(System.in);//Declaramos una variable de tipo Scanner en la cual se va a guardar lo que el usuario ingrese
        
        int tuna = 5;
        int base = 18;
        
        System.out.println(tuna++);//Esto aplica una suma al valor, pero no lo imprime de inmediato, podemos ver que lo imprime hasta la segund avez que lo mandamos a llamar
        System.out.println("Tuna alterada: " + tuna);
    }	
}

