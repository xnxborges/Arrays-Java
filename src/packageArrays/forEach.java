package packageArrays;

public class forEach {
	
	public static void main(String[] args) {
		
		double notas [] = { 9.9, 8.7, 7.2, 9.4};
		
		//For convencional
		for (int i = 0; i < notas.length; i++) {	
		}
		
		//Foreach
		for (double nota : notas) {
			System.out.println(nota);
		}
	}

}
