
public class toString {
	
	private int mes;
	private int dia;
	private int ano;
	
	
	public toString(int m,int d, int a) {//Este constructor al final regresa un string el cual viene con un metodo, al poner this busca un metodo llama toString para poder dar formato a la fecha
		this.mes = m;
		this.dia = d;
		this.ano = a;
		
		System.out.printf("The constructor for this is %s\n", this);
	}
	
	
	public String toString() {
		return String.format("%d/%d/%d", mes,dia,ano);
	}

}
