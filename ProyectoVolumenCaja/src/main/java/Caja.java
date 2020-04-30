
public class Caja {
    
    int alto;
    int ancho;
    int profundo;
    
    //Creamos un constructor vacío de la Clase Caja
    public Caja(){
        
    }
    
    //Creamos un constructor con argunmentos de la Clase Caja
    public Caja(int al, int an, int pr){
        
        this.alto = al;
        this.ancho = an;
        this.profundo = pr;
        
    }
    
    public int calcularVolumen(){
        return this.alto * this.ancho * this.profundo;
    }
}
