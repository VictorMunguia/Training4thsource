//Cabe destacar que cuando creamos una clase de tipo enumeracion realmente se esta haciendo un array.
public enum enumeracionClass {//Clase especial para crear objetos de tipo enumeracion
	victor("Chingon","22"),//De esta forma se declaran todos los posibles objetos enumerados
	Rachel("cute","10"),
	Fernanda("FirstLove","12"),
	Nicol("Italian","13"),
	candy("Diferent","14"),
	erin("blabla","18");
	
	private final String Descripcion;//atributos para guardar e imprimir la informacion que tenemos en esta clase enumerable
	private final String Ano;
	
	enumeracionClass(String Descripcion,String Ano){//Este es el metodo constructor de la clase enumerable
		this.Descripcion = Descripcion;
		this.Ano = Ano;
	}
	
	
	public String getDesc() {//De esta forma sacamos la informacion de descripcion y abajo el ano
		return Descripcion;
	}
	
	public String getAno() {
		return Ano;
	}

}
