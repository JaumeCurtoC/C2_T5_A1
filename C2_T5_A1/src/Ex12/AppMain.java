package Ex12;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaraci�n de Variables
		String constrase�a = "Contra01";
		String c = " ";
		int i = 0;
		
		//Bucle
		do {
			c = JOptionPane.showInputDialog("Introduzca la contrase�a: (Intentos restantes: "+(3-i)+")");
			
			//Salida de datos con condicional
			if(constrase�a.equals(c)) {
				System.out.println("Enhorabuena");
			}
			//Incremento de la variable
			i++;
			//Condicional del bucle
		}while(!constrase�a.equals(c) && i<3);
		
		
		
	}

}
