import java.util.Scanner;

public class promedio {
	public static void main(String args[]){//Metodo Main que marca el inicio de la aplicacion java.
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int grade;
		int average;
		int counter = 1;
		
		while (counter < 11) {
			System.out.println("write the number " + counter);
			grade = input.nextInt();
			total = total + counter;
			counter++;
		}
		average = total/10;
		System.out.println("Your avarge is " + average);
		
    }	

}
