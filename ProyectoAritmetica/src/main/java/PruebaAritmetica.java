
public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        //Creamos un objeto de tipo Aritmetica
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 10;
        aritmetica.b = 15;
        
        int resultado = aritmetica.sumar();
        
        System.out.println("resultado = " + resultado);
        
        //Creación de un segundo objeto
        Aritmetica aritmetica2 = new Aritmetica(4,2);
        System.out.println("resultado2 = " + aritmetica2.sumar());
        
    }
    
}
