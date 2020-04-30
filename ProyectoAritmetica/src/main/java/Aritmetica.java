
public class Aritmetica {
    
    //Atributos de la clase
    
    int a, b;
           
    public Aritmetica(){
        
        System.out.println("Ejecutando Constructor vacío");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        
        System.out.println("Ejecutan el constructor con dos argumentos");
    }
    
        public int sumar(){
           // int resultado = a + b; //Aquí utilizamos los atributos de la clase
           //return resultado;          
           
           return this.a + this.b;
        }
        
        public int restar(){
            return this.a - this.b;
        }
        
        public int multiplicar(){
            return this.a * this.b;
        }
        
        public int dividir(){
            return this.a / this.b;
        }
        
    
    
}
