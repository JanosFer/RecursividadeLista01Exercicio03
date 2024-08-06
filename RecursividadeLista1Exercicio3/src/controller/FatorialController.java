package controller;

public class FatorialController {
	public FatorialController() {
		super();
	}
	
	public int fatorial(int n) {
		//Condição de Parada: Se n for 1 ou 0, o seu fatorial é igual 1.
		
		if(n == 0 || n == 1) {
			return 1;
		}
		
		//Chamada dos Passos: retorna-se o resultado de n multiplicado pela função enviando n-1 como paramentro.
		
		return n * fatorial(n-1);
	}
}
