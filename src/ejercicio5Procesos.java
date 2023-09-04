
public class ejercicio5Procesos {
	public static  int [] sumaArreglos(int[] arreglo, int [] arreglo2) {
		int longitud = arreglo.length;
		int [] newArray = new int [longitud]; 
		for(int i = 0; i < longitud; i++){
			newArray[i] = arreglo[i] + arreglo2[i];
		}
		return newArray;
	}
}

