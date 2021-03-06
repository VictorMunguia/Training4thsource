import java.util.EnumSet;//Nos permite usar metodos para rangos en los enumerables

public class enumeracionClass2 {
	public static void main(String[] args) {
		for(enumeracionClass gente/*Primero nombramos una variable de tipo enumeracionClass la cual va a almacenar los objetos*/: enumeracionClass.values() /*Aqui ponemos el arreglo, en este caso es la clase y el metodo values para sacar todos los valores*/) {//Utilizamos el for para recorrer arays
			System.out.printf("%s\t%s\t%s\n", gente,gente.getDesc(),gente.getAno());
		}
		
		System.out.println("\n And now for the range of constants!!! \n");
		
		for(enumeracionClass gente: EnumSet.range(enumeracionClass.Rachel, enumeracionClass.candy)) {//Este metodo nos permite poner un rango de aparacion, en este caso es entre rachel y candy
			System.out.printf("%s\t%s\t%s\n", gente,gente.getDesc(),gente.getAno());
		}
	}

}
