import java.util.ArrayList;

public class ExecutaLista {

	public static void main(String[] args) {

		ArrayList contatos = new ArrayList<>();
		contatos.add("Carlos");
		contatos.add("Silva");
		contatos.add("Ricardo");
		contatos.add("Antonio");
		contatos.add("Andre");
		
		for(Object nome : contatos) {
			System.out.println(nome);
		}

	}

}
