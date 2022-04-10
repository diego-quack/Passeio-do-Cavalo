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
		
		horizontal[0] = 2; vertical[0] = -1;
		horizontal[1] = 1; vertical[1] = -2;
		horizontal[2] = -1; vertical[2] = -2;
		horizontal[3] = -2; vertical[3] = -1;
		horizontal[4] = -2; vertical[4] = 1;
		horizontal[5] = -1; vertical[5] = 2;
		horizontal[6] = 1; vertical[6] = 2;
		horizontal[7] = 2; vertical[7] = 1;
		
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < t; j++) {
				tabuleiro[i][j] = 0;
				tabuleiro[0][0] = 1;
			}
		}
		
	}

}
