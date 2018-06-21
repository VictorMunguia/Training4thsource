import java.util.Scanner;

public class switchDedicion {
	public static void main(String args[]){//Metodo Main que marca el inicio de la aplicacion java.
		int age;
		
		age = 3;
		
		switch(age) {//El switch funciona de la misma manera, no cambia nada.
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;
		case 3:
			System.out.println("You can get in trobles");
			break;
		default:
			System.out.println("You dont have the correct number");
			break;
		}
    }
}
