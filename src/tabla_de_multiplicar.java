import java.util.Scanner;

public class tabla_de_multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese el numero");
		int num = entrada.nextInt();
		for (int i = 1; i <= 10; i++) {
			
			int multi = num * i;
			
			System.out.println( num +"*" + i + "="+  multi);
		}
	}

}
