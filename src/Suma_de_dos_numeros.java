import java.util.Scanner;

public class Suma_de_dos_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese el primer numero");
		int num1 = entrada.nextInt();
		System.out.println("ingrese el segundo numero");
		int num2 = entrada.nextInt();
		
		int resultado = num1 + num2;
		
		System.out.println("el resultado es: " + resultado );
	}

}
