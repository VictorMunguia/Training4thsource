
public class timeClass {
	private int hora;
	private int minuto;
	private int segundo;//Inicialisamos unos atributos privadas
	
	
	public void setTime(int h, int m, int s) {//Creamos un metodo para acceder a los atributos y comprobar que la informacion que se incerta es correcta
		if(h >=0 && h<=24){
			hora = h ;
		}
		else {
			hora = 0;
		}
		
		if(m >=0 && m<=60){
			minuto = m ;
		}
		else {
			minuto = 0;
		}
		
		if(s >=0 && s<=60){
			segundo = s;
		}
		else {
			segundo = 0;
		}
		
	}
	
	public String toMilitary() {//Este metodo da el formato como si fuera tiempo y lo retornamos
		return String.format("%02d:%02d:%02d",hora,minuto,segundo);
	}
	

}