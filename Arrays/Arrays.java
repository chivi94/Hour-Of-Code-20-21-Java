public class Arrays{

    public static void main(String[] args) {
    	
        // UNIDIMENSIONALES
        int myArray[] = new int[5];
        
        // Rellenamos el array
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }
        
        // Imprimimos el contenido del array
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Contenido de myArray en posición("+i+"): " + myArray[i]);
        }

        // Tambien se puede rellenar el array en su propia creación
        char[] caracteres = new char[] {'a','b','c','d','e','f','g','h','i','j'};
        
        // BIDIMENSIONALES
        double bidimensionalArray[][] = new double[3][3];
        
        // Rellenamos el array bidimensional
        
        double numerito = 1.0;
        // Este primer for va recorriendo las filas
		for(int filas=0; filas<bidimensionalArray.length; filas++) {
			 	// Este segundo for recorre las columnas
			for(int columnas=0; columnas<bidimensionalArray[filas].length; columnas++) {
				 // Vamos rellenando el array cambiando de columna, pero manteniendonos en la misma fila hasta que 
				 // se acaban las columnas
				 bidimensionalArray[filas][columnas] = numerito;
				 numerito += 0.5;
			}
		}
		 
		// Imprimimos el array bidimensional
		
		// Para imprimirlo debemos recorrer también el array con 2 bucles anidados de tipo for, uno para las filas
		// y otro para las columnas. Así vamos accediendo a cada casilla.
		 
		// Recorremos las filas...
		for (int filas=0; filas<bidimensionalArray.length; filas++) {
			// Y las columnas...
			for(int columnas=0; columnas<bidimensionalArray[filas].length; columnas++) {
				System.out.print(bidimensionalArray[filas][columnas]);
			}
			// Imprimimos un salto de linea despues de imprimir cada fila 
			System.out.println();
		 }
        
    }

}