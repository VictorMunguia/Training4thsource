package polimorfismoBasic;
import java.util.Random;//paquete para invocar metodo para numeros random

public class mainClass {
	public static void main(String[] args) {
		animales[] listaAnimales1 = new animales[5];//Se crea un arreglo de tio animales para almacenar animales
		int numeroRandom;//variable para almacenar numero random
		animales p1 = new pescado();//creamos un objeto pescado
		animales pu1 = new puerco();//creamos un objeto puerco
		animales pe1 = new perro();//creamos un obetjo perro
		Random aleatorio = new Random();//creamos un objeto random
		
		for(int x = 0; x <5;x++) {//ciclo para llenar el arrelgo
			numeroRandom = 1+aleatorio.nextInt(3);//numero aleatorio que se guarda en variable
			
			switch(numeroRandom) {//el numero que sale caera en una de als tres posibilidades y es el objeto que se guardara en el arreglo
			case 1:
				listaAnimales1[x] = p1;
				break;
			case 2:
				listaAnimales1[x] = pu1;
				break;
			case 3:
				listaAnimales1[x] = pe1;
				break;
			}
			
			
		}
		
		
		for(animales x: listaAnimales1) {//Recorremos toda la lista guardando los objetos en x.
			x.ruido();//los objetos en x tiene como herencia animales el cual tiene el metodo ruido.
		}
		
		
	}
}
