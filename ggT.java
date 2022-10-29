import java.util.Scanner;
public class ggT {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ersteZahl = sc.nextInt();
		int zweiteZahl = sc.nextInt();
		
		while (ersteZahl != zweiteZahl) {
			if(ersteZahl > zweiteZahl) {
				ersteZahl = ersteZahl - zweiteZahl;
				
			}
			
			else {
				zweiteZahl = zweiteZahl - ersteZahl;
		
				}		
		}
	
	
	System.out.println(zweiteZahl);
	sc.close();
	
	}
}
