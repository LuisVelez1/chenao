import java.util.Arrays;

public class parte2Ejercicio4Principal {
	public static void main(String [] args) {
		int[] numeros = { 1, 2, 3, 16, 4, 7, 9, 8 };
		int rest = encontrarMaximo(numeros);
		System.out.println(rest);
		
	}
	public static int encontrarMaximo(int [] arreglo) {
			int maximo = arreglo[0];
				for(int num : arreglo) {
				if(num > maximo) {
						maximo = num;
					}
				}
			return maximo;
			}
}
