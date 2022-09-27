package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] navn : matrise ) {
			
			for (int verdi : navn) {
				
				System.out.print(verdi + " ");
				
			}
			
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String ut = "";
		
		for (int[] i : matrise) {
			for (int verdi : i) {
				ut += verdi + " " ;
			}
			ut += "\n";
		}
		return ut;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nymat = new int[matrise.length][matrise[0].length];
		
		for (int i = 0; i < matrise.length; i++) {
			
			for (int y = 0; y < matrise[i].length; y++) {
				nymat[i][y] = matrise[i][y] * tall;
			}
		}
		
		return nymat;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean likL = true;
		boolean like = true;
		int i = 0;
		
		if (a.length != b.length) {
			likL = false;
		}
		
		while (i < a.length && like == true && likL == true) {
			
			int y = 0;
			
			while (y < a[i].length && like == true) {
				
				if (a[i][y] != b[i][y]) {
					like = false;
				}
				
				y++;
			}
			i++;
		}
		return like;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		int[][] nymat = new int[matrise.length][matrise[0].length];
		
		int a = 0;
		
		for (int i = 0; i < matrise.length; i++ ) {
			
			int i2 = 0;

			for (int y = 0; y < matrise[0].length; y++  ) {
				nymat[a][i2] = matrise[y][i] ;

				i2++;
			}
			a++;
		}
		return nymat;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
