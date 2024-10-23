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
		
		System.out.println();
		System.out.print("Digite o id do funcionário que terá seus dados atualizados: ");
		int id = sc.nextInt();
		
		for (int i = 0; i<pessoas.length;i++) {
			if(pessoas[i].getId() == id) {
				System.out.println(pessoas[i]);
				
				System.out.println();
				System.out.print("Digite o número correspondente ao dado que será atualizado (1-nome, 2-email 3-endereço e 4-nenhum):");
				int change = sc.nextInt();
				
				switch(change) {
				case 1:
					System.out.print("Digite o novo nome: ");
					sc.nextLine();
					String name = sc.nextLine();
					pessoas[i].setName(name);
					break;
				
				case 2:
					System.out.print("Digite o novo email: ");
					String email = sc.next();
					pessoas[i].setEmail(email);
					break;
					
				case 3:
					System.out.print("Digite o novo endereço: ");
					sc.nextLine();
					String endereco = sc.nextLine();
					pessoas[i].setAdress(endereco);
					break;
					
				default:
					System.out.println("Nenhuma alteração foi feita!");
					
				}
				
				System.out.println();
				System.out.println("Lista de pessoas atualiada: ");
				for (int j = 0; j < pessoas.length; j++) {
					System.out.println(pessoas[j].toString());
				}
			}
		}
		
		
		
		sc.close();

	}
	
}
