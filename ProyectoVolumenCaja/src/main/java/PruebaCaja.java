import java.util.Scanner;

public class PruebaCaja {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("*********************************************************");
        System.out.println("**** PROGRAMA PARA DETERMINAR EL VOLUMEN DE UNA CAJA ****");
        System.out.println("*********************************************************");
        System.out.println(" ");
        System.out.println("Por favor ingrese el valor del alto de la caja:");
        int v1 = teclado.nextInt();
        System.out.println("Por favor ingrese el valor del ancho de la caja:");
        int v2 = teclado.nextInt();
        System.out.println("Por favor ingrese el valor de la profundidad de la caja:");
        int v3 = teclado.nextInt();
        System.out.println(" ");
        
        //Creo mis variables locales
//        int v1 = 2;
//        int v2 = 3;
//        int v3 = 6;
        
        //Creo mi objeto de la Clase Caja
        Caja caja1 = new Caja(v1, v2, v3);
        
        //Imprimo los valores de v1, v2 y v3
//        System.out.println("alto = " + v1);
//        System.out.println("ancho = " + v2);
//        System.out.println("Profundo = " + v3);
        
        //Aqui vamos a imprimir el valor del volumen de la caja
        System.out.println("El volumen de la caja es: "+ caja1.calcularVolumen());
        
    }
}
