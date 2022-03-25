package packageArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		//Scanner para o usuario entrar com as qtde notas
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas: ");
		
		//Scanner armazena as notas
		int qtdeNotas = entrada.nextInt();
		
		//Array de notas
		double notas [] = new double [qtdeNotas];
		
		//For convencional para armazenas as notas digitadas
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + ":");
			notas[i] = entrada.nextDouble();
			
			//Exibe as notas
			System.out.println(Arrays.toString(notas));
		}
		
		double total = 0;
		for (double nota : notas) {
			total += nota;
			
		}
		 
		double media = total/notas.length;
		System.out.println("A média é: " + media + "!");
		entrada.close();
	}
}
