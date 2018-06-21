import java.util.Random;

public class ElementosComoContadoresArreglo {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int freq[] = new int [7];
		
		for(int roll = 1; roll<1000; roll++) {//Este ciclo permite que cuando salga un numero del indice, se le aumente 1 al total
			++freq[1+rand.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		
		for(int face=1;face<freq.length; face++) {
			System.out.println(face + "\t" + freq[face]);
		}
		
	}
}
