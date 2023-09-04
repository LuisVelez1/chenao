	public class parte2ejercicio6Principal{
		public static void main(String[] args) {
				int[] arreglo = { 1, 2, 3, 14, 5 };
				int[] arreglo2 = {2, 3, 4, 15, 6 };

				int[] suma = Procesos .sumaArreglos(arreglo, arreglo2);
				for(int num : suma) {
					System.out.println(num + " ");
				}	
		}
		public class Procesos {
			public static  int [] sumaArreglos(int[] arreglo, int [] arreglo2) {
				int longitud = arreglo.length;
				int [] newArray = new int [longitud]; 
				for(int i = 0; i < longitud; i++){
					newArray[i] = arreglo[i] + arreglo2[i];
				}
				return newArray;
			}
		}
}
	

