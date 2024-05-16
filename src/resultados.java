import java.util.Scanner;

public class resultados {

	public static void main(String[] args) {
		// 5. Escriba un programa Java que tome dos números como entrada y muestre el producto de dos números.
		
		Scanner entrada = new Scanner (System.in);
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int resultado = num1 * num2;
		System.out.println("el resultado de la muulti" + num1 + "*" + num2  +"=" + resultado);

	}

}
