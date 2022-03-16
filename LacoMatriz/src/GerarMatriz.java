import java.util.Scanner;

public class GerarMatriz {

	public static void main(String[] args) {

		String[] nomeFuncionario = new String[5];

		for (int cont = 0; cont <= 4; cont++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Entre com o Funcionario==> " + (cont+ 1) + "º: ");
			nomeFuncionario[cont] = entrada.next();

			entrada.close();
		}

	}

}
