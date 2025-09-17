package main.java.fag;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== ATIVIDADE JAVA BÁSICO - 10 QUESTÕES ===\n");
		
		// Executar todas as questões
//		questao1_Scanner(scan);
//		questao2_Print();
//		questao3_For();
//		questao4_If(scan);
//		questao5_While(scan);
//		questao6_Metodos(scan);
//		questao7_ScannerIf(scan);
//		questao8_ForPrint();
//		questao9_WhileScanner(scan);
		questao10_MetodosFor();
		
		scan.close();
	}
	
	// ========================================
	// QUESTÃO 1 - SCANNER (Entrada de Dados)
	// ========================================
	// TODO: Crie um programa que leia o nome e a idade de uma pessoa
	// e exiba uma mensagem de boas-vindas personalizada
	// Exemplo: "Olá João! Você tem 20 anos. Seja bem-vindo(a)!"
	
	public static void questao1_Scanner(Scanner scan) {
		System.out.println("Informe seu nome: \n");
			String nome = scan.nextLine();
		System.out.println("Informe sua idade: \n");
			int idade = scan.nextInt();
			scan.nextLine();
		System.out.printf("Olá %s! Você tem %d anos. Seja bem-vindo(a)!", nome, idade);
		
	}
	
	// ========================================
	// QUESTÃO 2 - PRINT (Saída de Dados)
	// ========================================
	// TODO: Crie um programa que exiba uma tabela de multiplicação do 5 (de 1 a 10)
	// Formate a saída de forma organizada
	// Exemplo: "5 x 1 = 5", "5 x 2 = 10", etc.
	
	public static void questao2_Print() {
		System.out.println("=== QUESTÃO 2 - PRINT ===");
		int c;
		int resposta; 
		System.out.println("\nTabela do 5:\n");
			for (c = 1; c <= 10; c++ ) { 
				resposta = 5* c; 
				System.out.printf("5 x %d = %d\n", c, resposta);
			}
		
	}
	
	// ========================================
	// QUESTÃO 3 - FOR (Laço de Repetição)
	// ========================================
	// TODO: Crie um programa que calcule e exiba a soma dos números de 1 até 100
	// Use um laço for para fazer o cálculo
	// Resultado esperado: 5050
	// Código: 
	public static void questao3_For() {
		System.out.println("=== QUESTÃO 3 - FOR ===");
		int numero;
		int soma =0; 
		for (numero = 1; numero <=100; numero ++) { soma += numero; }
		System.out.printf("A soma dos numeros 1 a 100 e: %d ", soma );
	}
	
	// ========================================
	// QUESTÃO 4 - IF (Estrutura Condicional)
	// ========================================
	// TODO: Crie um programa que leia uma nota e informe:
	// - Aprovado (nota >= 7): "Parabéns! Você foi APROVADO!"
	// - Recuperação (4 <= nota < 7): "Você está em RECUPERAÇÃO. Estude mais!"
	// - Reprovado (nota < 4): "Infelizmente você foi REPROVADO. Tente novamente!"
	// Código: 
	public static void questao4_If(Scanner scan) {
		System.out.println("=== QUESTÃO 4 - IF ===");
		System.out.println("Digite sua nota (0 a 10):");
		double nota = scan.nextDouble();
		scan.nextLine();
			if (nota >= 7) { System.out.println("Parabens! Voce foi APROVADO!"); }
			else if (nota <= 4 && nota <7 ) { System.out.println("Você esta em RECUPERAÇAO. Estude mais!"); }
			else {System.out.println("Infelizmente você foi REPROVADO. Tente novamente!");}
		
	}
	
	// ========================================
	// QUESTÃO 5 - WHILE (Laço de Repetição)
	// ========================================
	// TODO: Crie um programa que leia números inteiros até que o usuário digite 0
	// e então exiba a soma de todos os números digitados
	// código: 
	public static void questao5_While(Scanner scan) {
		System.out.println("=== QUESTÃO 5 - WHILE ===");
		// SEU CÓDIGO AQUI
		int a = 1; 
		int soma = 0; 
			while (a != 0) {
			System.out.println("Digite números inteiros (digite 0 para parar):");
				a = scan.nextInt();
				scan.nextLine(); 
				soma += a; 
			}
		System.out.printf("Codigo encerrado! \nSoma: %d", soma);
		
	}
	
	// ========================================
	// QUESTÃO 6 - MÉTODOS (Função)
	// ========================================
	// TODO: Crie um método que receba dois números e retorne o maior entre eles
	// Teste o método com diferentes valores
	// Dica: Use o método encontrarMaior() que está declarado abaixo
	// Código: 
	public static void questao6_Metodos(Scanner scan) {
		System.out.println("=== QUESTÃO 6 - MÉTODOS ===");
			System.out.println("Digite o primeiro número:");
			int n1 = scan.nextInt (); 
			scan.nextLine(); 
			System.out.println("Digite o segundo número:");
			int n2 = scan.nextInt (); 
			scan.nextLine(); 
		
		System.out.println("O maior número é: " + encontrarMaior(n1,n2) );

	}
	
	// ========================================
	// QUESTÃO 7 - SCANNER + IF
	// ========================================
	// TODO: Crie um programa que leia um número e informe se ele é par ou ímpar
	// Use o operador % (módulo) para verificar o resto da divisão por 2
	public static void questao7_ScannerIf(Scanner scan) {
		System.out.println("=== QUESTÃO 7 - SCANNER + IF ===");
		// SEU CÓDIGO AQUI
		System.out.println("Digite um número inteiro:");
		int numero = scan.nextInt();
		scan.nextLine(); 
		if (numero % 2 == 0) {System.out.println("O numero e PAR");} 
		else {System.out.println("O numero e IMPAR");} 
	
	}
	
	// ========================================
	// QUESTÃO 8 - FOR + PRINT
	// ========================================
	// TODO: Crie um programa que exiba todos os números pares de 2 até 20
	// Exiba um número por linha
	public static void questao8_ForPrint() {
		System.out.println("=== QUESTÃO 8 - FOR + PRINT ===");
		// SEU CÓDIGO AQUI
		int i;
		for (i=1; i <=20; i++) {
			if (i % 2 == 0) {
			System.out.printf("%d \n", i);} }	
	}
	
	// ========================================
	// QUESTÃO 9 - WHILE + SCANNER
	// ========================================
	// TODO: Crie um programa que leia números até que o usuário digite um número negativo
	// e conte quantos números positivos foram digitados
	public static void questao9_WhileScanner(Scanner scan) {
		System.out.println("=== QUESTÃO 9 - WHILE + SCANNER ===");
		// SEU CÓDIGO AQUI
		double np = 0;
		int cont = 0;
		while (np >= 0) {
			System.out.println("Digite números (digite um número negativo para parar):\n");
			np = scan.nextDouble();
			scan.nextLine(); 
			cont ++;  }
		cont -= 1;
		System.out.printf("Codigo encerrado! \nForam digitados %d numero(s) POSITIVOS", cont);
	}
	
	// ========================================
	// QUESTÃO 10 - MÉTODOS + FOR
	// ========================================
	// TODO: Crie um método que receba um número e retorne o fatorial desse número
	// Teste o método com os valores 5 e 7
	// Dica: Use o método calcularFatorial() que está declarado abaixo
	// Fatorial de 5 = 5! = 5 x 4 x 3 x 2 x 1 = 120
	public static void questao10_MetodosFor() {
		System.out.println("=== QUESTÃO 10 - MÉTODOS + FOR ===");
		// SEU CÓDIGO AQUI
		int numero = 5;
		System.out.println("O fatorial de " + numero + " e " + calcularFatorial(numero));
	}
	
	// ========================================
	// MÉTODO PARA QUESTÃO 6
	// ========================================
	// TODO: Implemente este método para retornar o maior entre dois números
	public static int encontrarMaior(int a, int b) {
		if (a > b) { return a;}
	    else if (b > a) {return b;}
	    else {
	        System.out.println("\nOs números são iguais!\n");
	        return a; } // pode retornar a ou b, pq os dois são iguais
	}
	
	// ========================================
	// MÉTODO PARA QUESTÃO 10
	// ========================================
	// TODO: Implemente este método para calcular o fatorial de um número
	// Use um laço for para fazer o cálculo
	public static long calcularFatorial(int n) {
		// SEU CÓDIGO AQUI
		long fatorial = 1;
		int i;  

			for (i = 1; i<= n; i ++) { fatorial *= i; }
		return fatorial; 
	}
}