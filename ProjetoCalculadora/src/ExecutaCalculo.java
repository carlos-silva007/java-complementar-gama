import java.util.Scanner;

public class ExecutaCalculo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero1, numero2, opcao;

		System.out.print("Digite Primeiro Numero: ");
		numero1 = entrada.nextInt();

		System.out.print("Digite Segundo Numero: ");
		numero2 = entrada.nextInt();

		System.out.println("Digite a Opera��o: ");
		System.out.println(" 1- Adi��o (+)");
		System.out.println(" 2- Subtra��o (-)");
		System.out.println(" 3- Multiplica��o (*)");
		System.out.println(" 4- Divis�o (/)");
		System.out.println(" 5- Sair");
		opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Soma total: " + (numero1 + numero2));
			break;
		case 2:
			System.out.println("Subtra��o total: " + (numero1 - numero2));
			break;
		case 3:
			System.out.println("Multiplica��o total: " + (numero1 * numero2));
			break;
		case 4:
			System.out.println("Divis�o total: " + (numero1 / numero2));
		case 5:
		default:
		}

		entrada.close();

	}

}
