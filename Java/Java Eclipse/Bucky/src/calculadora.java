import java.util.Scanner;

public class calculadora {
	
	public static void main(String args[]){//Metodo Main que marca el inicio de la aplicacion java.
        double valor1;
        double valor2;
        double respuesta;
        
		System.out.print("Escriba el primer numero: ");
        
        Scanner numeroImpreso1 = new Scanner(System.in);
        
        valor1  = numeroImpreso1.nextDouble();
        
        System.out.print("Escriba el segundo numero: ");
        
        Scanner numeroImpreso2 = new Scanner(System.in);
        
        valor2  = numeroImpreso2.nextDouble();
        
        respuesta = valor1 + valor2;
        
        System.out.print("El resultado de la suma es: " + respuesta);
		
    }	

}
