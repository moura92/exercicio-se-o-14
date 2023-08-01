package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

		List<Produto> lista = new ArrayList<>();

		System.out.print("Digite a quantidade de produtos: ");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.println("Dados do produto nº " + i + ": ");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preço = sc.nextDouble();
			if (ch == 'u') {
				System.out.print("Data de fabricação (DD/MM/AAAA): ");
				Date fabricação = sdf.parse(sc.next());
				Produto p = new ProdutoUsado(nome, preço, fabricação);
				lista.add(p);
			} else if (ch == 'i') {
				System.out.print("Taxa alfandegária: ");
				Double taxa = sc.nextDouble();
				lista.add(new ProdutoImportado(nome, preço, taxa));
			} else if (ch == 'c') {
				lista.add(new Produto(nome, preço));
			}

		}

		System.out.println();
		ProdutoImportado pi = new ProdutoImportado();
		System.out.println("Etiqueta de Preços:");
		for (Produto l : lista) {
			System.out.println(l.etiquetadepreço());
			
			
			sc.close();
		}

	}

}
