import java.util.Scanner;

public class Dividir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. Escriba un programa Java para dividir dos números e imprimirlos en la
		// pantalla.
		// Datos de prueba

		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese el primer numero a dividir");
		String num1 = entrada.nextLine();
		System.out.println("ingrese el segundo numero a dividir");
		String num2 = entrada.nextLine();

		int intNum1 = Integer.parseInt(num1);
		int intNum2 = Integer.parseInt(num2);
		
		int resultado = intNum1 / intNum2;
		
		System.out.println("resultado es:" + resultado);

	}

}
