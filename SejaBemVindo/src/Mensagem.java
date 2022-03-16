import java.util.Locale;
import java.util.Scanner;

public class Mensagem {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informa o nome do Produto: ");
		String nome = entrada.next();

		System.out.print("Valor Unitario: ");
		Double valor = entrada.nextDouble();

		System.out.print("Quantidade: ");
		Double quantidade = entrada.nextDouble();

		Double soma = valor * quantidade;

		System.out.print("Nome do Produto: " + nome + " Total de Produtos: " + soma);

		entrada.close();
	}

}
