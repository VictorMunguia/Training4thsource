import java.util.Scanner;

public class claseInstancia1 {
	public static void main(String args[]){//Metodo Main que marca el inicio de la aplicacion java.
		System.out.println("Please write the name of your first girlfriend: ");
		Scanner nombreNovia = new Scanner(System.in);
		
		claseInstancia2 C1 = new claseInstancia2();
		
		C1.setName(nombreNovia.nextLine());
		
		C1.saying();
		
    }	
}
