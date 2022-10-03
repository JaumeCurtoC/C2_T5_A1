package Ex1;

public class AppMain {

	public static void main(String[] args) {
		// Declaración de variables
		int x = 10;
		int y = 10;
		
		//Comprobación de los datos
		if(x<y) {
			System.out.println("El valor de Y: "+y+" es mayor que el valor de X: "+x);
		}else if(x>y) {
			System.out.println("El valor de X: "+x+" es mayor que el valor de Y: "+y);
		}else {
			System.out.println("Los valores de X e Y son iguales: X="+x+" Y="+y);
		}
	}

}
