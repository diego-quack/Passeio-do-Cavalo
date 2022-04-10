package application;

import entities.PasseioDoCavalo;

public class PasseioDoCavaloTeste {

	public static void main(String[] args) {
		
		PasseioDoCavalo passeio = new PasseioDoCavalo(8);
		boolean teste = passeio.tenta(2, 0, 0);
		if(teste) {
			passeio.imprime();
		}
		else {
			System.out.println("Sem solução");
		}
	}
}
