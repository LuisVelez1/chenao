import javax.swing.JOptionPane;

public class parte2Ejercicio2Principal {
	public static void main(String [] args) {
		imprimirNumero(0);
	}
		public static void imprimirNumero(int number) {
						number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
						if(number <= 10) {
					System.out.println("No se puede imprimir el numero porque no es mayor a 10");
					}else {
						System.out.println(number);
					}
		}
}

	

