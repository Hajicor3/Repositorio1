package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de pessoas que serão adicionadas: ");
		int n = sc.nextInt();
		
		Pessoas[] pessoas = new Pessoas[n];
		
		for (int i = 0; i < pessoas.length; i++) {
			
			System.out.print("Digite o id da pessoa: ");
			int id = sc.nextInt();
			System.out.print("Digite o nome da pessoa: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite o email da pessoa: ");
			String email = sc.next();
			System.out.print("Digite o endereço da pessoa: ");
			sc.nextLine();
			String endereco = sc.nextLine();
			System.out.print("Digite a data de nascimento da pessoa(dia/mês/ano): ");
			String dataNascimento= sc.nextLine();
			System.out.println();
			
					
			
			pessoas[i] = new Pessoas(id,nome,email,endereco,dataNascimento);
		}
		
		System.out.println();
		System.out.println("Lista de pessoas: ");
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println(pessoas[i].toString());
		}
		
		sc.close();

	}

}
