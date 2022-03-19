package aplicacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entidades.CadastroCliente;

public class AppCadastro {

	public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		String mostra = "";
		String nomeArq = "C:\\Users\\Developer Carlos\\Documents\\curso\\clientes.txt";
		String linha = "";
		File arq = new File(nomeArq);

		int opcao;

		ArrayList<CadastroCliente> cadastros = new ArrayList<>();

		do {
			System.out.println("=== Digite a Operação Desejada ===");
			System.out.println(" 1- Cadastro Cliente");
			System.out.println(" 2- Listar Clientes Cadastrados");
			System.out.println(" 3- Gravar Dados em Arquivo");
			System.out.println(" 4- Consultar Dados em Arquivo");
			System.out.println(" 5- Sair");
			opcao = entrada.nextInt();

			if (opcao == 5) {
				System.out.println("Saindo do Sistema!!");
			} else {

			}
			switch (opcao) {
			case 1:
				System.out.println("Digite Nome do Cliente: ");
				String nome = entrada.next();
				System.out.println("Digite o E-mail: ");
				String email = entrada.next();
				System.out.println("Digite Agencia: ");
				int agencia = entrada.nextInt();
				System.out.println("Digite Conta Corrente: ");
				int conta = entrada.nextInt();
				System.out.println("Digite Telefone: ");
				String telefone = entrada.next();
				System.out.println("Digite Saldo da Conta: ");
				Double saldo = entrada.nextDouble();

				CadastroCliente cliente = new CadastroCliente(nome, email, agencia, conta, telefone, saldo);
				cadastros.add(cliente);
				break;
			case 2:
				System.out.println(cadastros.toString());
				break;
			case 3:
				FileWriter arquivo = new FileWriter(nomeArq);
				PrintWriter gravarArquivo = new PrintWriter(arquivo);
				gravarArquivo.printf("Lista de Clientes \n");
				for (int i = 0; i < cadastros.size(); i++) {
					gravarArquivo.println(cadastros);
				}

				arquivo.close();
				System.out.println("Arquivo Gravado Com Sucesso!!!");
				break;
			case 4:
				if (arq.exists()) {
					mostra = "Arquivo - " + arq + ", aberto com sucesso";
					System.out.println(mostra);
					mostra = "Tamanho do Arquivo==> " + Long.toString(arq.length()) + " Bytes" + "\n";
					System.out.println(mostra);
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

					} catch (Exception error) {

					}
					JOptionPane.showMessageDialog(null, mostra, "Arquivo!!!", 1);
				} else {
					JOptionPane.showMessageDialog(null, "Arquivo nao Existe", "Erro", 0);
				}
				 break;
			}

		} while (opcao < 5 || opcao == 0 || opcao > 5);
		entrada.close();
	}
}