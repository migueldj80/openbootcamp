package openbootcamp;

/**
 *
 * @author migle
 */
public class Tarea01 {

/**
 *
 * @author Miguel Ledesma
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Sumar 3 valores : (5,10,24)");
        System.out.println("Resultado = "+suma(5,10,24));
    }
    
    public static int suma(int a, int b, int c) {
        return a+b+c;
    }
}