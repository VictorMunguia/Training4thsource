
public class finalAtributos {
	private int sum;
	private final int NUMBER;
	
	public finalAtributos(int x) {
		NUMBER = x;
	}
	
	public void add() {
		sum = sum + NUMBER;
	}
	
	public String toString() {
		return String.format("sum = %d\n", sum);
	}
	
}
