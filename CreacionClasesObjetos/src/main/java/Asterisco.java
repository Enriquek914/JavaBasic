
public class Asterisco {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

        System.out.println("  ");
        
       //EScalera invertida de Asteriscos
       var can= 0;

        for (int fila = 5; fila > can; fila--) {
            for (int columna = fila; columna > can ; columna--) {
                
                System.out.print("*");

            }
             System.out.println(); 
            
        }
    }

}
