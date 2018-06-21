
public class toString3 {
	private String name;
	private toString cumpleanos;//Este atributo es el tipo toString que es la clase que icimos previamente
	
	public toString3(String nombre, toString fecha) {//Este constructor pide un nombre y un obetjo de tipo toString
		this.name = nombre;
		this.cumpleanos = fecha;
	}
	
	
	public String toString() {//Esto le da formato al objeto cuando se esta imprimiendo
		return String.format("My name is %s, my birthday is %s" ,  name,cumpleanos);
	}

}
