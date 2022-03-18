import java.util.Scanner;

public class CadastroFuncionario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nome;
		String email;
		int idade;

		System.out.println("Informe Funcionario: ");
		nome = entrada.nextLine();
		System.out.println("Informe o Email: ");
		email = entrada.nextLine();
		System.out.println("Informe Funcionario: ");
		idade = entrada.nextInt();

		ProcParametrosRec executa = new ProcParametrosRec();
		executa.mensagem(nome, email, idade);
		
		executa.anoNasc(nome, idade);
		
		
		entrada.close();
	}

}
