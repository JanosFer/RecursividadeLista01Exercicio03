package view;

import controller.FatorialController;

public class Principal {
	public static void main(String[] args) {
		FatorialController fc = new FatorialController();
		
		int n = 6;
		
		System.out.println(fc.fatorial(n));
	}
}
