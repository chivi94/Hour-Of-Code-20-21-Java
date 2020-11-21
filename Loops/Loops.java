public class Loops{

    public static void main(String[] args) {
        
        /**
         * Tenemos 3 tipos de bucles en Java:
         * - for
         * - while
         * - do-while
         */

         System.out.println("Bucle for");
         for(int i = 0; i < 10; i++){
            System.out.println("Me llego por el número " + i);
         }

         int contador = 0;
         System.out.println("Bucle while");
         while(contador < 10){
            System.out.println("Me llego por el número " + contador);
            contador++;
         }

        contador = 0;
        System.out.println("Bucle do-while");
        do{
            System.out.println("Me llego por el número " + contador);
            contador++;
        }while(contador < 10);

    }

}