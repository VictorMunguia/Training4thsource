
public class claseInstancia2 {
	private String girlName;//Declaramos un atributo privado
	
	public void setName(String name) {//Declaramos un metodo que no va a retornada nada el cual nos permitira almacenar un valor en el metodo privado
		girlName = name;
	}
	
	public String getName() {//Declaramos un metodo el cual nos va a permitir retornar el valor que hay dentro del metodo privado
		return girlName;
	}
	
	public void saying() {//Nos permite imprimir un mensaje con el nombre de la primer novia
		System.out.printf("Your first girlfriend was %s", getName());//Para imprimir un objeto de un metodo, utilizamos el printf el cual nos permite invocar un metodo e imprimir el valor
	}
}
