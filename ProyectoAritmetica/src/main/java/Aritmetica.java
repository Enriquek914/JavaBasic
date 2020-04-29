
public class Aritmetica {
    
    //Atributos de la clase
    
    int a, b;
           
    public Aritmetica(){
        
//        a = 5;
//        b = 3;
        
        System.out.println("Ejecutando Constructor vacío");
    }
    
    public Aritmetica(int arg1, int arg2){
        a = arg1;
        b = arg2;
        
        System.out.println("Ejecutan el constructor con dos argumentos");
    }
    
        public int sumar(){
            int resultado = a + b; //Aquí utilizamos los atributos de la clase
            return resultado;            
        }
        
    
    
}
