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
		return sum;*/
		
		for(int k : tabell) {
			sum += k;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false;
		int i = 0;
		while (i<tabell.length && !funnet) {
			if (tabell[i]==tall) {
				funnet = true;
			}
			i++;
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		if (tabell == null) {
			return -1;
		}
		int i = 0;
		
		while (i < tabell.length) {
			if (tabell[i] == tall) {
				return i;
			} else {
				i = i+1;
			}
		}
		return -1;
		

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] nytab = new int [tabell.length];
		int y = 0;
		for (int i = tabell.length -1; i >= 0; i--) {
			nytab[y] = tabell[i];
			y++;
		}
		return nytab;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
