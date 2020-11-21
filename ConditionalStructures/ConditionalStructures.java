import java.util.Scanner;

public class ConditionalStructures {

	public static void main(String[] args) {
		
		/**
         * Las estructuras condicionales se usan en los lenguajes de programacióon para
         * controlar el flujo de los programas. En base a una condiciones impuestas por
         * el programador, se puede elegir qué se ejecuta o que no. Veremos ejemplos a
         * continuación.
         */

        /**
         * La primera de todas y la mas sencilla, el if-else. Se pueden encandenar
         * tantos como queramos, aunque en este caso, sólo vamos a usar 2.
         */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número mayor que 5: ");
		int numero = teclado.nextInt();
		if (numero <= 5) {
			System.out.println("¡Oye, que te he dicho que sea mayor que 5!");
		}
		else {
			System.out.println("Muchas gracias por hacerme caso :D");
		}
		
		/**
         * Ahora vamos a ver el operador ternario. Es equivalente al if-else, mas
         * elegante, aunque menos legible. El anterior if-else con el operador ternario
         * seria algo asi...
         */
		
		String mensaje = numero <= 5 ? "¡Oye, que te he dicho que sea mayor que 5!" : "Muchas gracias por hacerme caso :D";
        System.out.println(mensaje);
        
        /**
         * Por ultimo, vamos a ver el switch-case. Hay que tener en cuenta que entre
         * los parentesis del switch se pone una expresión, y los case evaluan el
         * resultado de esta. Por ejemplo, si quisiéramos distinguir entre los casos
         * en que el usuario introduce un 5, un 4, y todos los demás casos, habría que hacer
         * algo como esto...
         */
        
        switch (numero) {
        case 4:
            System.out.println("¡Has introducido un 4!");
            break;
        case 5:
        	System.out.println("¡Has introducido un 5!");
        default:
            System.out.println("¡Has introducido un número que no es ni 4 ni 5!");
        }

        teclado.close();
	}

}
