import java.util.Scanner;

public class ExemploCase {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int funcoes;
		System.out.println("=================");
		System.out.println("Escolha a Op��o atitimetica: ");
		System.out.println("1 - Adi��o ");
		System.out.println("2 - Subtra��o ");
		System.out.println("3 - Divis�o ");
		System.out.println("4 - Multiplica��o ");
		System.out.println("5 - SAIR ");

		funcoes = entrada.nextInt();
		switch (funcoes) {
		case 1:
			System.out.println("Op��o 1- Adi��o");
			break;
		case 2:
			System.out.println("Op��o 2- Subtra��o");
			break;
		case 3:
			System.out.println("Op��o 3- Divis�o");
			break;
		case 4:
			System.out.println("Op��o 4- Multiplica��o");

		default:
			System.out.println("SAINDO");
		}

		entrada.close();
	}

}
