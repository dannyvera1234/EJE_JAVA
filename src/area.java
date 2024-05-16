import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el radio");
		double radio = entrada.nextDouble();
		
		double resul = Math.pow (radio, 2);
		double peri =   Math.PI*radio*radio;
		System.out.println(resul);
		System.out.println(peri);
		
	}

}
