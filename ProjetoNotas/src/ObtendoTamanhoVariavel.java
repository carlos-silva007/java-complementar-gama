import java.util.Scanner;

public class ObtendoTamanhoVariavel {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String senha;

		System.out.println("Informe a Senha: ");
		senha = entrada.next();

		System.out.println("Quantidade de digitos: " + senha.length());

		if (senha.length() <= 4) {
			System.out.println("Senha Invalida, deve conter minimo 6 digitos: " + senha);

		} else if (senha.equals("gama@2022")) {
			System.out.println("Senha esta correta!");
		} else {
			System.out.println("Senha Invalida!!!");
		}

		entrada.close();
	}

}
