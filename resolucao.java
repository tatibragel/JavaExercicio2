package exercicio2;

import java.util.Scanner;


public class resolucao {

	public static void main(String[] args) {
		// Crie um programa que calcule a m�dia de um aluno para a mat�ria de matem�tica.
		//O aluno deve informar seu nome e as quatro notas da mat�ria.
		
		double soma;
		double media;
		Scanner sc = new Scanner (System.in);
		System.out.print("Qual o seu nome?: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite sua nota do primeiro bimestre: ");
		float nota1 = sc.nextFloat();
		
		
		System.out.print("Digite sua nota do segundo bimestre: ");
		float nota2 = sc.nextFloat();
		
		
		System.out.print("Digite sua nota do terceiro bimestre: ");
		float nota3 = sc.nextFloat();
		
		
		System.out.print("Digite sua nota do quarto bimestre: ");
		float nota4 = sc.nextFloat();
		
		
		soma = nota1 + nota2 + nota3 + nota4;
		media = soma / 4;
		System.out.printf(nome +  " sua m�dia � : %.2f", media );
		
		sc.close();
		
	

	}

}
