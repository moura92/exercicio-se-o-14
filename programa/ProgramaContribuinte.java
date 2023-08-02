package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.ContribuinteEmpresa;
import entidades.ContribuinteIndividual;

public class ProgramaContribuinte {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuinte> lista = new ArrayList<>();

		System.out.print("Digite o número de contribuintes: ");
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			System.out.println("Dados do contribuinte nº " + i + ": ");
			System.out.print("Pessoa física ou jurídica (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double rendaanual = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Despesas com saúde: ");
				Double despesasaude = sc.nextDouble();
				lista.add(new ContribuinteIndividual(nome, rendaanual, despesasaude));
			} else if (ch == 'c') {
				System.out.print("Número de empregados: ");
				Integer numeroempregados = sc.nextInt();
				lista.add(new ContribuinteEmpresa(nome, rendaanual, numeroempregados));
			}
		}

		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		for (Contribuinte cont : lista)
			System.out.println(cont.getNome() + ": R$" + String.format("%.2f", cont.taxa()));

		System.out.println();
		Double soma = 0.0;
		for(Contribuinte somar : lista)
			soma += somar.taxa();
			System.out.println("TOTAL DE IMPOSTOS: " + String.format("%.2f", soma));
		sc.close();
	}

}
