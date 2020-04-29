
public class PalabraContinue {
    
        public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            //Imprimimos solo número pares
            if (i % 2 != 0) {
              continue;         
            } 
            System.out.println("i = " + i);

        }

    }
}
