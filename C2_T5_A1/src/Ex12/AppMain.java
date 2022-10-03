package Ex12;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de Variables
		String constraseña = "Contra01";
		String c = " ";
		int i = 0;
		
		//Bucle
		do {
			c = JOptionPane.showInputDialog("Introduzca la contraseña: (Intentos restantes: "+(3-i)+")");
			
			//Salida de datos con condicional
			if(constraseña.equals(c)) {
				System.out.println("Enhorabuena");
			}
			//Incremento de la variable
			i++;
			//Condicional del bucle
		}while(!constraseña.equals(c) && i<3);
		
		
		
	}

}
