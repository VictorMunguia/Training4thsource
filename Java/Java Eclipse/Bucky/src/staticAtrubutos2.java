
public class staticAtrubutos2 {
	public static void main(String[] args) {
		staticAtrubutos persona1 = new staticAtrubutos("Megan","Fox");
		staticAtrubutos persona2 = new staticAtrubutos("Natalia","Portman");
		staticAtrubutos persona3 = new staticAtrubutos("Taylor","Swift");
		staticAtrubutos persona4 = new staticAtrubutos("Rolon","Queen");
		
		System.out.println(staticAtrubutos.getMembers());//Los metodos estaticos no necesitan que se cree un objeto para mandarlos a llamar
		System.out.println(persona2.getFirst());
		System.out.println(persona2.getLast());
		System.out.println(persona2.getMembers());
		
		
	}

}