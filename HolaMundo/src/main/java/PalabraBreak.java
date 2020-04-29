
public class PalabraBreak {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            //Imprimimos solo número pares
            if (i % 2 == 0) {
                System.out.println("i = " + i);
                
                break; 
                /*
                La palabra Break nos permite romper la ejecución de un ciclo,
                que en este caso es el ciclo For.
                Para este caso solo vamos a imprimir en primer número par.
                */

            }

        }

    }

}
