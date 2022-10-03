package Ex2_3;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de Variables
		//String n = "Jaume"; //Ex2
		
		String n = JOptionPane.showInputDialog("Introduce tu nombre:"); //Ex 3
		
		//Salida de Datos
		System.out.println("Bienvenido "+n);

	}

}
