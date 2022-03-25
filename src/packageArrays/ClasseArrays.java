package packageArrays;

import java.util.Arrays;

public class ClasseArrays {
	
	public static void main(String[] args) {
		
		//Iniciando uma Array de 3 posições
		double notasAlunoA [] = new double [3];
		notasAlunoA [0] = 7.9;
		notasAlunoA [1] = 8;
		notasAlunoA [2] = 6.7;
		
		//Exibindo todos os valores do Arrya
		System.out.println(Arrays.toString(notasAlunoA));
		
		//Primeira posição do Array
		System.out.println(notasAlunoA[0]);
		
		//Última posição do Array
		System.out.println(notasAlunoA[2]);
		
		//Última posição do Array dinamica
		System.out.println(notasAlunoA [notasAlunoA.length -1]);
		
		
		//Percorrendo o Array
		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		double media = total/notasAlunoA.length;
		System.out.println(media);
		
	}
}
