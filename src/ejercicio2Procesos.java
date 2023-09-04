
import javax.swing.JOptionPane;

public class ejercicio2Procesos {
	public void imprimirNumero(int number) {
		number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		if(number <= 10) {
			System.out.println("No se puede imprimir el numero porque no es mayor a 10");
		}else {
			System.out.println(number);
		}
	}
}

