package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Skatt {

	public static void main(String[] args) {

		String tallStr = showInputDialog("Bruttoinntekt? ");

		double bruttoIntekt = Double.parseDouble(tallStr);

		if (bruttoIntekt >= 934051) {
			System.out.println(
					"Skattetrinn 4: " + " " + "Du skal betale: " + bruttoIntekt * 16.2 / 100 + " " + "i skatt!");
		} else if (bruttoIntekt >= 580651) {
			System.out.println(
					"Skattetrinn 3: " + " " + "Du skal betale: " + bruttoIntekt * 13.2 / 100 + " " + "i skatt!");
		} else if (bruttoIntekt >= 230951) {
			System.out.println(
					"Skattetrinn 2: " + " " + "Du skal betale: " + bruttoIntekt * 4.0 / 100 + " " + "i skatt!");
		} else if (bruttoIntekt >= 164102) {
			System.out.println(
					"Skattetrinn 1: " + " " + "Du skal betale: " + bruttoIntekt * 1.7 / 100 + " " + "i skatt!");
		} else if (bruttoIntekt >= 0) {
			System.out.println("Skattetrinn 0: " + " " + "Du skal betale: " + "0 kr" + " " + "i skatt!");

		}
	}
}
