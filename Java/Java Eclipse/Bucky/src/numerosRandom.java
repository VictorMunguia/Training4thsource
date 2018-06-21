import java.util.Random;//Invocamos la libreria para crear numeros aleatorios

public class numerosRandom {
	public static void main(String[] args) {
		
		Random dice = new Random();
		int number;
		
		for(int contador = 1; contador <=10; contador++) {
			number = 1+dice.nextInt(6);//Esto lo que guarda en la variable number es un numero aleatorio entre 0 a 5, ya que el 6 da un rango de 6 numero incluyendo el 0, el +1 es para aumentar ese rango de 1 a 6
			System.out.println("El dado numero: " + contador + " Marco el numero: " + number);
		}
		
	}

}
