
public class herencia {//Clase mastra, donde las demas clases estan heredando
	
	public int Numero;
	
	public void CadenaTexto() {//Metodo normal que se compartira a las clases que heredan esta
		System.out.println("Vengo desde herencia");
	}
	
	private void CadenaTextoPrivada() {//Metodo privado que no sera heredado por ser privado
		System.out.println("Vengo desde herencia y soy privada");
	}
	
	public void sobreEscritura() {//Metodo normal que sera sobreescrito en la clase donde sera heredado
		System.out.println("Vengo desde herencia");
	}

}
