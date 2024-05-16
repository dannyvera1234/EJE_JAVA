import java.util.Scanner;

public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese 3v numero");
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		
		int resul = (num1 + num2 + num3)/ 3;
		System.out.println(resul);
	}

}
