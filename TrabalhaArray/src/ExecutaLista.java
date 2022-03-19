import java.util.ArrayList;

public class ExecutaLista {

	public static void main(String[] args) {

//		ArrayList<String> contatos = new ArrayList<>();
//		contatos.add("Carlos");
//		contatos.add("Silva");
//		contatos.add("Ricardo");
//		contatos.add("Antonio");
//		contatos.add("Andre");
//
//		for (Object nome : contatos) {
//			System.out.println(nome);}

		ArrayList<Contato> contatos = new ArrayList<>();

		Contato contato1 = new Contato("Carlos Silva", "carlos@gmail.com");
		Contato contato2 = new Contato("Marcos Silva", "marcos@gmail.com");
		Contato contato3 = new Contato("Antonio Oliver", "antonio@gmail.com");
		Contato contato4 = new Contato("Ricardo Oliveira", "ricardo@gmail.com");

		contatos.add(contato1);
		contatos.add(contato2);
		contatos.add(contato3);
		contatos.add(contato4);

		for (Contato cont : contatos) {
			System.out.println(cont.getNome() + " - " + cont.getEmail());
		}
		System.out.println("Total de Itens ==> " + contatos.size());
		System.out.println(contatos.contains(contato2));
		System.out.println(contatos.get(2).getNome());
	}

}
