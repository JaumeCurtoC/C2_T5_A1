package Ex5;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n de Variables
		String s = JOptionPane.showInputDialog("Indique un n�mero: (solo n�meros enteros)");
		
		//Parseo de String a Int
		int i = Integer.parseInt(s);
		
		//Salida de datos
		if(i%2==0) {
			System.out.println("El n�mero "+ i +" es divisible entre 2");
		}else {
			System.out.println("El n�mero "+ i +" no es divisible entre 2");
		}
		

	}

}
