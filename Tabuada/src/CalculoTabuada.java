import java.util.Scanner;

public class CalculoTabuada {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero pra Calculo ==> ");
		int numero = entrada.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + numero + " = "+ (i * numero));
		}
		
		int contador = 1;
		do {
			System.out.println(contador + "x"+ numero + "=" + (contador * numero));
		}while(contador < 10);
		
						
		entrada.close();
		
	}

}
