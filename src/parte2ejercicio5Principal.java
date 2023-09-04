import java.util.ArrayList;
public class parte2ejercicio5Principal {
	
		    public static void main(String[] args) {
		        ArrayList<Integer> numbers = new ArrayList<>();	        numbers.add(10);
		        numbers.add(5);
	        numbers.add(20);
		        numbers.add(8);
		
		        int maxValue = findMaxValue(numbers);
		        System.out.println("el amximo valor en la lista es: " + maxValue);
		    }
		
	    public static int findMaxValue(ArrayList<Integer> list) {
		        if (list.isEmpty()) {
	            throw new IllegalArgumentException("no esta en la lista");
		        }	
		        int max = list.get(0);
		        for (int num : list) {
		            if (num > max) {
		                max = num;
		            }
		        }
		        return max;
	    }
}



