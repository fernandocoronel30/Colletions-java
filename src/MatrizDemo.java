
public class MatrizDemo {

	public static void main(String[] args) {
		int matriz[][] = {
				{1,2,3,4,5},//0
				{6,7,8,9,10},//1
				{11,12,13,14}//2
		};
		
		//System.out.println(matriz[1][3]);//Forma de acceder al 9
		
		for (int fila = 0; fila < matriz.length; fila++) {
			for(int columna = 0; columna < matriz[fila].length; columna++) {
				System.out.print(matriz[fila][columna]);
			}//for columna
			System.out.println();
		}//for fila
		
	}//main
}//MatrizDemo
