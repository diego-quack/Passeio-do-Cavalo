package entities;

public class PasseioDoCavalo {
	
	private int t;
	private int horizontal[];
	private int vertical[];
	private int tabuleiro[][];
	
	public PasseioDoCavalo(int t) {
		this.t = t;
		this.tabuleiro = new int[t][t];
		this.vertical = new int[t];
		this.horizontal = new int[t];
		
	}

}
