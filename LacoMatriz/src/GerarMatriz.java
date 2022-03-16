import java.util.Scanner;

public class GerarMatriz {

	public static void main(String[] args) {

		String[] nomeFuncionario = new String[7];

		for (int cont = 1; cont < nomeFuncionario.length; cont++) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Entre com o Funcionario==> " + cont + "º: ");
			nomeFuncionario[cont] = entrada.next();
			// System.out.println(cont + "-" + nomeFuncionario[cont]);

			entrada.close();
		}
		for (String funcionarios : nomeFuncionario)
			System.out.println(funcionarios);
	}

}
