import java.util.Locale;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
        Locale.setDefault(Locale.US);
        double x = 3.1415;
		System.out.println("Obrigado Deus!");
		System.out.printf("%.2f", x);
		
	
		Scanner sc = new Scanner(System.in);
		String a;
		a = sc.next();
		System.out.println("Você digitou: " + a);
		
		sc.close();
		
	}

}