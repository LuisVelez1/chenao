
public class ejercicio4Procesos {
		public  int encontrarMaxim(int[] arreglo) {
			int maximo = arreglo[0];
			for(int num : arreglo) {
				if(num > maximo) {
					maximo = num;
				}
			}
			return maximo;
		}
}
