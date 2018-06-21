
public class arrayTable {
	public static void main(String[] args) {
		System.out.println("Index\tValue");//De esta forma es como declaramos que queremos hacer una imprecion en forma de tabla, aqui declaramos los campos
		
		int arreglo1[] = {32,54,64,325,56,77,23};
		
		
		for(int contador = 0; contador <arreglo1.length;contador++) {
			System.out.println(contador + "\t" + arreglo1[contador]);//Aqui imprimmimos los resultados
		}
	}
}
