
public class timeClassInvocation {
	public static void main(String[] args) {
		
		timeClass TC1 = new timeClass();//Creamos una instancia del objeto TC1
		
		TC1.setTime(26, 35, 22);//llenamos los atributos
		
		System.out.println(TC1.toMilitary());//Imprimimos lo que retorna nuestro metodo
	}

}
