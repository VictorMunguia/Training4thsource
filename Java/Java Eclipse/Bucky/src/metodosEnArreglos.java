
public class metodosEnArreglos {
	public static void main(String[] args) {
		
		int arreglo1[] = {3,4,5,6,7};//Creamos un arreglo
		
		metodosEnArreglos.change(arreglo1);//Mandamos a llamar el metodo estatico que creamos en esta clase
		
		for(int x:arreglo1) {//Imprimimos el arreglo que fue modifiado por el arreglo estatico
			System.out.println(x);
		}
		
	
	}
	
	
	public static void change(int x[]) {//Este es el metodo etatico , el cual resive como parametro un arreglo el cual se manda a llamar abajo para que a cada obejeto dentro del arreglo se le sumen 5
		for(int contador = 0; contador < x.length; contador++) {
			x[contador] = x[contador] + 5;
		}
	}

}
