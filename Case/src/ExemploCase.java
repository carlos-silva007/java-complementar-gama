import java.util.Scanner;

public class ExemploCase {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int funcoes;
		System.out.println("=================");
		System.out.println("Escolha a Opção atitimetica: ");
		System.out.println("1 - Adição ");
		System.out.println("2 - Subtração ");
		System.out.println("3 - Divisão ");
		System.out.println("4 - Multiplicação ");
		System.out.println("5 - SAIR ");

		funcoes = entrada.nextInt();
		switch (funcoes) {
		case 1:
			System.out.println("Opção 1- Adição");
			break;
		case 2:
			System.out.println("Opção 2- Subtração");
			break;
		case 3:
			System.out.println("Opção 3- Divisão");
			break;
		case 4:
			System.out.println("Opção 4- Multiplicação");

		default:
			System.out.println("SAINDO");
		}

		entrada.close();
	}

}
