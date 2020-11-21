import java.io.*;
import java.util.Scanner;

/**
 * Vamos a aprender a manejar ficheros textuales en una aplicacion Java. La referencia a los ficheros
 * se guarda en una variable, y manejamos esa variable como si del fichero se tratara. Los pasos a
 * seguir siempre son los mismos, en este orden: APERTURA, OPERACION A REALIZAR (lectura o escritura)
 * y CIERRE. Para ello, utilizaremos algunas clases auxiliares.
 * Cuando manejamos ficheros, siempre tenemos que incluir bloques try-catch, que son los que manejaran
 * la excepcion en caso de que ocurra algo inesperado (el fichero especificado no existe, no
 * tenemos permiso para abrirlo, etc.).
 */
public class Files {

	public static void main(String[] args) {
	// LECTURA DE FICHEROS TEXTUALES
		try {
			// Declaracion y apertura
			// Si el fichero existe -> se ejecuta normalmente
			// Si el fichero no existe -> EXCEPCION (bloque catch)
			Scanner ficheroLectura;
			ficheroLectura = new Scanner(new File("hola.txt"));
			
			// Leemos el fichero por lineas con el metodo nextLine()
			String linea1 = ficheroLectura.nextLine();
			System.out.println(linea1);
			String linea2 = ficheroLectura.nextLine();
			System.out.println(linea2);
			// Pero si el fichero es muy largo, esto se hace muy enfarragoso...
			// El metodo hasNextLine() nos devuelve true o false segun si hay mas lineas que
			// se puedan leer en el fichero o no, ¡asi recorrerlo es mucho mas facil!
			String linea;
			while (ficheroLectura.hasNextLine()) {
				linea = ficheroLectura.nextLine();
				System.out.println(linea);
			}
			
			// Cierre
			ficheroLectura.close();
		}
		// Debemos capturar la excepcion en caso de que se intente abrir un archivo que no existe
		catch (FileNotFoundException e) {
			System.out.println("¡No he encontrado el fichero!");
		}
	
	// ESCRITURA DE FICHEROS TEXTUALES
		try {
			// Declaracion y apertura
			// Si el fichero existe -> se sustituye por uno nuevo
			// Si el fichero no existe -> se crea uno nuevo
			PrintWriter ficheroEscritura;
			ficheroEscritura = new PrintWriter(new File("fichero.txt"));
			
			// Escribimos una linea en el fichero con el metodo println()
			ficheroEscritura.println("¡Estoy escribiendo en el fichero!");
			ficheroEscritura.println("Otra linea");
			
			// Cierre
			ficheroEscritura.close();
		}
		// Debemos capturar la excepcion en caso de no poder abrir el fichero
		catch (IOException e) {
			System.out.println("¡No he podido abrir el fichero!");
		}
		
		// Se puede hacer con otras clases
		System.out.println("---Lectura y escritura con clases Buffered---");
		// LECTURA
		try {
			BufferedReader ficheroLectura2 = new BufferedReader(new FileReader("hola.txt"));
			String linea1 = ficheroLectura2.readLine();
			System.out.println(linea1);
			String linea;
			while ((linea = ficheroLectura2.readLine()) != null) {
				System.out.println(linea);
			}
			ficheroLectura2.close();
		}
		catch (IOException e) {
			System.out.println("¡He capturado alguna excepcion!");
		}
		
		// ESCRITURA
		try {
			BufferedWriter ficheroEscritura2 = new BufferedWriter(new FileWriter("fichero.txt"));
			ficheroEscritura2.write("¡Estoy escribiendo en el fichero!");
			ficheroEscritura2.newLine();
			ficheroEscritura2.write("Otra linea");
			ficheroEscritura2.close();
		}
		catch (IOException e) {
			System.out.println("¡He capturado alguna excepcion!");
		}
	}
}