package pacote;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Produto> ListaProdutos = new ArrayList<Produto>();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("--------------------------------------");
		System.out.println("   Iniciando Cadastro de Produtos...");
		System.out.println("--------------------------------------");
		
//		var pra definir quantos produtos vao ser cadastrados
		System.out.print("\nDigite quantos produtos vc quer computar: ");
		int num_produtos = scn.nextInt();
		
//		loop para cadastrar cada produto denominado dentrro do ArrayList
		for(int contador = 0; contador < num_produtos; contador++) {
			
//			Criação de um indice para númerar cada produto criado
			System.out.println("\n--- Insira o produto [" + (contador + 1 ) + "] ---");
			
			System.out.print("Digite o Modelo do Produto: ");
			String modelo = scn.next();
			
			System.out.print("Digite a Marca do Poduto: ");
			String marca = scn.next();
			
			System.out.print("Digite o Preço do seu Produto: R$");
			double preco = scn.nextDouble();
			
//			criação de um novo "produto" para ser enviado para o ArrayList
			Produto novo_produto = new Produto(marca, modelo, preco);
			
//			função pra adicionar todos os itens cadastrados no ArrayList 
			ListaProdutos.add(novo_produto);
		}
//		Saída
		System.out.println("--------------------------------------");
		System.out.println("         Lista de Produtos: ");
		System.out.println("--------------------------------------");
		
//		loop pra ficar mais legivel o print
		for(Produto contador : ListaProdutos) {
			System.out.println("Marca:  " + contador.getMarca());
			System.out.println("Modelo: " + contador.getModelo());
			System.out.println("Preco:  R$" + contador.getPreco());
			System.out.println();
		}
	}
}
