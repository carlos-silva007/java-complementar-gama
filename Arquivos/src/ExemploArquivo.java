import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExemploArquivo {

	public static void main(String[] args) throws IOException {

		String[] nomes = { "Marcos", "Pedro", "Regina", "Carlos", "Ronaldo" };

		FileWriter arquivo = new FileWriter(
				"c:\\Users\\Developer Carlos\\Desktop\\Material Apoio - Estudos\\funcionarios.txt"); // criar arquivo
		PrintWriter gravarArquivo = new PrintWriter(arquivo); // gravar conteudo dentor do arquivo

		gravarArquivo.printf("Registros Funcionarios");
		for (int contador = 0; contador < 4; contador++) {
			gravarArquivo.println(nomes[contador]);
		}
		arquivo.close();
		System.out.println("Arquivo gravado na unidade C:\\Users\\Carlos Silva\funcionarios.txt");
	}

}
