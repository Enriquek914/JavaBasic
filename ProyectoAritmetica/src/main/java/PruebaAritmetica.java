
public class PruebaAritmetica {

    public static void main(String[] args) {

//        //Creamos un objeto de tipo Aritmetica
//        Aritmetica aritmetica = new Aritmetica();
//        aritmetica.a = 10;
//        aritmetica.b = 15;
//        
//        int resultado = aritmetica.sumar();
//        
//        System.out.println("resultado = " + resultado);
//        
//        //Creación de un segundo objeto
//        Aritmetica aritmetica2 = new Aritmetica(4,2);
//        System.out.println("resultado2 = " + aritmetica2.sumar());
// --------------------------------------------------------------------------------      
        //Variable Local
        int operandoA = 6;
        int operandoB = 2;

        //Creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);

        //Imprimimos los valores de los operandos
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        //Imprimimos el resultado de la suma
        System.out.println("\n El resultado de la suma es: " + objeto1.sumar());
        
        //Imprimimos el resultado de la resta
        System.out.println("\n El resultado de la resta es: " + objeto1.restar());
        
        //Imprimimos el resultado de la multiplicación
        System.out.println("\n El resultado de la multiplicación es: " + objeto1.multiplicar());
        
        //Imprimimos el resultado de la división
        System.out.println("\n El resultado de la división es: " + objeto1.dividir());
        
        

    }

}
