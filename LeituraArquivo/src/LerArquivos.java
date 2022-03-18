import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class LerArquivos {

	public static void main(String[] args) {

		String mostra = "";
		String nomeArq = "C:\\Users\\Developer Carlos\\Desktop\\Material Apoio - Estudos\\funcionarios.txt";
		String linha = "";

		File arq = new File(nomeArq);

		if (arq.exists()) {// verifica se o arquivo existe
			mostra = "Arquivo - " + arq + ", aberto com sucesso";
			System.out.println(mostra);
			// System.out.println("Arquivo - " + nomeArq + "Aberto com Sucesso");
			mostra = "Tamanho do Arquivo==> " + Long.toString(arq.length()) + " Bytes" + "\n"; // ver qts de bytes
			System.out.println(mostra);

			// ler informaçoes do arquivo
			try {
				FileReader reader = new FileReader(nomeArq);
				BufferedReader leitor = new BufferedReader(reader);
				while (true) {
					linha = leitor.readLine();
					System.out.println(linha);
					if (linha == null)
						break;
					mostra += linha + "\n";
				}
			} catch (Exception erro) {
			}
			// System.out.println("Conteudo Existente");
			JOptionPane.showMessageDialog(null, mostra, "Arquivo ...", 1);
		} else {
			// System.out.println("Arquivo Nao Existe!");
			JOptionPane.showMessageDialog(null, "Arquivo Inexistente", "ERRO", 0);
		}

	}
}
