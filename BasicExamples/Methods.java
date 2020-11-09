import java.util.*;

public class Methods {

    /**
     * Soy un procedimiento. Me caracterizo porque no tengo valor de vuelta (soy void) y solo ejecuto una serie de operaciones dentro de mi.
     */
    public static void procedimiento(int argumento1, int argumento2){
        int resultado = argumento1 + argumento2;
        System.out.println("La suma de " + argumento1 + " y " + argumento2 + " = " + resultado);
    }

    /**
     * Soy una funcion. Me caracterizo porque tengo un valor de vuelta, con el que luego se puede trabajar.
     */
    public static int funcion(int argumento1, int argumento2){
        int resultado = argumento1 + argumento2;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mensaje = "Introduzca un numero entero.";
        System.out.print(mensaje);
        int numero1 = teclado.nextInt();
        System.out.print(mensaje);
        int numero2 = teclado.nextInt();

        procedimiento(numero1,numero2);
        int resultado = funcion(numero1, numero2);
        System.out.println("La suma de " + numero1 + " y " + numero2 + " = " + resultado);
    }
    
}