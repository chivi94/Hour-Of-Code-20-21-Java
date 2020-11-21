public class ArraysExample{

    public static void main(String[] args) {
        
        int myArray[] = new int[5];
        // Fill array
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = i;
        }
        // Print array
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Contenido de myArray en posición("+i+"): " + myArray[i]);
        }

    }

}