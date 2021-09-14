package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO3 {

	public static void main(String[] args) {

		String nNumber = showInputDialog("Skriv inn et tall: ");

		int n = Integer.parseInt(nNumber);

		String outTxt = "";

		int total = 1;

		for (int i = n; i >= 1; i--) {
			if (i == 1) {
				outTxt += i;
			} else {
				outTxt += i + "*";
				total = total * i;

			}

		}
		showMessageDialog(null, outTxt + " = " + total);
	}
}
