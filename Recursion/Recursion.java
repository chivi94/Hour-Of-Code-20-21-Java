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

    public static int factorialIterativo(int n){
        int resultado = 1;
        for(int i = n; i > 0; i--){
            resultado *= i;
        }
        return resultado;
    }

    public static int factorialRecursivo(int n){
        if(n == 0 || n == 1) return 1;
        else return n * factorialRecursivo(n-1);
    }

    public static String reverseStringIterativo(String s){
        String resultado = "";
        for(int i = s.length() - 1; i >= 0; i--){
            resultado += s.charAt(i);
        }
        return resultado;
    }

    public static String reverseStringRecursivo(String s){
        if(s.equals("") || s == null) return "";
        if(s.length() == 1) return s;
        return s.charAt(s.length()-1) + reverseStringRecursivo(s.substring(0, s.length()-1));
    }

    public static String reverseStringRecursivo2(String s){
        if(s.equals("") || s == null) return "";
        if(s.length() == 1) return s;
        return reverseStringRecursivo2(s.substring(1)) + s.charAt(0);
    }



    public static void main(String[] args) {
        System.out.println(potenciaIterativa(2,3));
        System.out.println(potenciaRecursiva(3,3));
        System.out.println(factorialIterativo(5));
        System.out.println(factorialRecursivo(6));
        System.out.println(reverseStringIterativo("Hola Mundo"));
        System.out.println(reverseStringRecursivo("Hola Mundo"));
        System.out.println(reverseStringRecursivo2("Hola Mundo"));
    }

}