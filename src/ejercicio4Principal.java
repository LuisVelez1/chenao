public class ejercicio4Principal{
	public static void main(String[] args) {
			int[] numeros = { 1, 2, 3, 14, 5, 7, 9, 8 };
			ejercicio4Procesos conPConR4 = new ejercicio4Procesos();
			int valorMaximo = conPConR4.encontrarMaxim(numeros);
			System.out.println("El valor máximo del areglo es: " + valorMaximo);
	}
}


