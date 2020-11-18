public class Recursion{

    public static int potenciaIterativa(int base, int exponente){
        int resultado = 1;
        for(int i = 0; i < exponente; i++){
            resultado *= base;
        }
        return resultado;
    }

    public static int potenciaRecursiva(int base, int exponente){
        if(base == 0 || base == 1 || exponente == 1) return base;
        if(exponente == 0) return 1;
        return base * potenciaIterativa(base, exponente - 1);
    }



    public static void main(String[] args) {
        System.out.println(potenciaIterativa(2,3));
        System.out.println(potenciaRecursiva(3,3));
    }

}