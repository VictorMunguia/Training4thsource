
public class staticAtrubutos {
	private String first;
	private String last;
	private static int members = 0;
	
	public staticAtrubutos(String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructor para %s %s , Miembros en el club: %d\n", first,last,members);
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public static int getMembers() {
		return members;
	}
	
	
	
}
