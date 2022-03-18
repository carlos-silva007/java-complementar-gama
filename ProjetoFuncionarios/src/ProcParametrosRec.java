
public class ProcParametrosRec {

	public void mensagem(String nome, String email, int idade) {
		System.out.println("O Nome do Funcionario: " + nome + " sua idade é: " + idade + " seu email: " + email);
	}
	
	public void anoNasc(String nome, int idade) {
		System.out.println("Nome Funcionario: "+nome+" nasceu no ano: "+ (idade-2022));
	}

}
