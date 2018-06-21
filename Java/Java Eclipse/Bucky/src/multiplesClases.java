import java.util.Scanner;

public class multiplesClases {
	public static void main(String[] args) {
		multiplesClasesClase2 c1 = new multiplesClasesClase2();//Inicialisamos la clase para poder crear un objeto de tipo multiplesClasesClase2
		
		c1.simpleMessage();//Invocamos un metodo del objeto c1
		
		System.out.println("Enter your name plz: ");
		
		Scanner NombreInput = new Scanner(System.in);//Pedimos un nombre
		
		String Nombre = NombreInput.nextLine();//Convertimos el objeto dado por el usuario a tipo line para poder meterlo en una variable tipo string
		
		multiplesClasesClase2 c2 = new multiplesClasesClase2();//creamos otro objeto dle mismo tipo
		
		c2.anotherSimpleMessage(Nombre);//utilizamos el metodo que pide el parametro nombre
			
		
		
	}
}
