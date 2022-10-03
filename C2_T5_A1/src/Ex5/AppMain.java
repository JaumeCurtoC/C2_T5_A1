package Ex5;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de Variables
		String s = JOptionPane.showInputDialog("Indique un número: (solo números enteros)");
		
		//Parseo de String a Int
		int i = Integer.parseInt(s);
		
		//Salida de datos
		if(i%2==0) {
			System.out.println("El número "+ i +" es divisible entre 2");
		}else {
			System.out.println("El número "+ i +" no es divisible entre 2");
		}
		

	}

}
