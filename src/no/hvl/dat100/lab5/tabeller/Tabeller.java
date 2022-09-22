package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i : tabell) {
			System.out.print(i + " ");
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < tabell.length; i++) {
			sb.append(tabell[i]+",");
		}
		String str = sb.toString();
		str = str.replaceFirst(".$","");
		String nytab = ("["+str+"]");
		return nytab;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		
		/*for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
		
		int j = 0;
		while (j < tabell.length) {
			sum += tabell[j];
			j++;
		}
		return sum; */
		
		for(int k : tabell) {
			sum += k;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
