
public class invocandoElementosArrelgo {
	public static void main(String[] args) {
		int arreglo1[] = {22,55,66,77,33};
		int suma = 0;
		
		for(int contador = 0; contador < arreglo1.length; contador++) {
			suma = suma + arreglo1[contador];
		}
		
		System.out.println("La suma de todos los elementos es: " + suma);
	}
}
