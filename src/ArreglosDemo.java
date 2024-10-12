import java.util.Arrays;

public class ArreglosDemo {
	public static void main(String[] args) {
		// Formas de declarar un arreglo
		// tipo de dato[] nombre del arreglo = {valor1, valor2, etc...};

		String[] months = { "Enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };
		
		System.out.println(months[0]);
		System.out.println(months[11]);
		
		//No debe utilizarse porque ocupa mucha memoria.
		months = Arrays.copyOf(months, 13);
		months[12] = "otroembre";
	
		//Recorriendo el arreglo
//		for(int cont = 0; cont < months.length; cont++) {
//			System.out.println(months[cont]);
//		}//for cont
		
		
		//otra forma de recorrer arreglos
		for(String month: months) {
			System.out.println(month);
		}//foreach
		

	}// main
}//class ArreglosDemo
