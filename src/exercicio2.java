import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		double base;
		double altura;
		double area;
		
		Scanner ler = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Digite a base do triangulo:");
		base = ler.nextDouble();
		System.out.print("Digite a altura do triangulo:");
		altura = ler.nextDouble();

		area = (base*altura)/2.0;
		
		System.out.print("A area dos triangulo é:" + area);
		

		ler.close();
	}

}
