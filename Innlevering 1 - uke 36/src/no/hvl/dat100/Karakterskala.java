package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Karakterskala {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			String tallStr = showInputDialog("Poengsum: ");

			int poengsum = Integer.parseInt(tallStr);

			if (poengsum >= 101 || (poengsum <= -1)) {
				
			} else if (poengsum >= 90) {
				System.out.println("Karakter A!");
			} else if (poengsum >= 80) {
				System.out.println("Karakter B!");
			} else if (poengsum >= 60) {
				System.out.println("Karakter C!");
			} else if (poengsum >= 50) {
				System.out.println("Karakter D!");
			} else if (poengsum >= 40) {
				System.out.println("Karakter E!");
			} else if (poengsum <= 39) {
				System.out.println("Karakter F! Stryk!");
			}
			{

			}

		}

	}
}
