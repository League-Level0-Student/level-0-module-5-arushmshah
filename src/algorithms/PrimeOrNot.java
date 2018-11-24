package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	
int count = 0;
	
String p = JOptionPane.showInputDialog("Name a random number that you think is prime.");	
	
	int prime = Integer.parseInt(p);
	
	for(int i=2; i < prime; i++) {
		if(prime%i==0) {
			count++;		
		}
	}
	
	if(count>0) {
		JOptionPane.showMessageDialog(null, "Your number is not prime.");
	}

	else {
		JOptionPane.showMessageDialog(null, "Your number is prime!");
	}
	
	
	
	
	
	
	
}
}