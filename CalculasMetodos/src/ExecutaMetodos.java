import java.util.Scanner;

public class ExecutaMetodos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num1, num2, opcao;
		System.out.println("Digite a Operação: ");
		System.out.println(" 1- Adição (+)");
		System.out.println(" 2- Subtração (-)");
		System.out.println(" 3- Multiplicação (*)");
		System.out.println(" 4- Divisão (/)");
		System.out.println(" 5- Sair");
		opcao = entrada.nextInt();

		if (opcao == 5) {
			System.out.println("Saindo");
		} else {
			System.out.println("Informe Primeiro Numero: ");
			num1 = entrada.nextInt();
			System.out.println("Informe Segundo Numero: ");
			num2 = entrada.nextInt();

			switch (opcao) {
			case 1:
				Adicao ad = new Adicao();
				ad.execAdicao(num1, num2);
				break;
			case 2:
				Subtracao sub = new Subtracao();
				sub.execSubtracao(num1, num2);
				break;
			case 3:
				Multiplicacao mt = new Multiplicacao();
				mt.execMultiplicacao(num1, num2);
				break;
			case 4:
				Divisao dv = new Divisao();
				dv.execDivisao(num1, num2);
				break;
			case 5:
				System.out.println("Sair");
				break;
			}
		}
		entrada.close();
	}

}
