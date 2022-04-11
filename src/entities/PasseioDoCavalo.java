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

		horizontal[0] = 2;
		vertical[0] = 1;
		horizontal[1] = 1;
		vertical[1] = 2;
		horizontal[2] = -1;
		vertical[2] = 2;
		horizontal[3] = -2;
		vertical[3] = 1;
		horizontal[4] = -2;
		vertical[4] = -1;
		horizontal[5] = -1;
		vertical[5] = -2;
		horizontal[6] = 1;
		vertical[6] = -2;
		horizontal[7] = 2;
		vertical[7] = -1;

		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t; j++) {
				tabuleiro[i][j] = 0;
				tabuleiro[0][0] = 1;
			}
		}
	}
	
	public boolean tenta(int i, int x, int y) {
		int u;
		int v;
		int k;
		boolean q;
		
		k = -1;
		
		do {
			k = k + 1;
			q = false;
			u = x + horizontal[k];
			v = y + vertical[k];
			
			if((u >= 0) && (u <= 7) && (v >= 0) && (v <= 7)) {
				if(tabuleiro[u][v] == 0) {
					tabuleiro[u][v] = i;
					if(i < t * t) {
						q = tenta(i + 1, u, v);
						if(!q) {
							tabuleiro[u][v] = 0;
						}
					}
					else {
						q = true;
					}
				}
			}
		}
		while (!q && (k != 7));
		return q;
	}
	
	public void imprime() {
		for(int i = 0; i < t; i++) {
			for(int j = 0; j < t; j++) {
				System.out.println("\t" + this.tabuleiro[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
