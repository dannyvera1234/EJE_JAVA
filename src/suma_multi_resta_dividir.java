import java.util.Scanner;

public class suma_multi_resta_dividir {

	public static void main(String[] args) {
		// 6. Escriba un programa Java para imprimir la suma (suma), multiplicar, restar, dividir y el resto de dos números.
		
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("inrese el primer numeroo");
		int num1 = entrada.nextInt();
		System.out.println("ingresa el segnudo numero");
		int num2 = entrada.nextInt();
		
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multi = num1 * num2;
		int divi = num1 / num2;
		
		System.out.println("suma: " + suma);
		System.out.println("resta: " + resta);
		System.out.println("multiplicacion:" + multi);
		System.out.println("dividir: " + divi);
		
	}
	
}
