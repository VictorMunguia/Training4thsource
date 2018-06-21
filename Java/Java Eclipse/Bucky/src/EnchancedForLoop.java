
public class EnchancedForLoop {
	public static void main(String[] args) {
		
		int arreglo1[] = {4,5,6,7,8};
		int total = 0;
		
		
		for(int x: arreglo1) {//Este ciclo, se encarga de darle la vuelta a todo un arreglo, almacenando el valor de cada espacio en x
			total = total + x;
		}
		
		
		System.out.println(total);
	}
}
