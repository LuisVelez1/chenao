
public class ejericicio5Principal {
	public static void main(String[] args) {
		int[] arreglo = { 1, 2, 3, 14, 5 };
		int[] arreglo2 = {2, 3, 4, 15, 6 };
		ejercicio5Procesos conPConR5 = new ejercicio5Procesos();
		int[] suma = ejercicio5Procesos.sumaArreglos(arreglo, arreglo2);
		
		for(int num : suma) {
			System.out.println(num + " ");
		}	
}

	
}
