
public class PruebaPersonas {

    public static void main(String[] args) {
        
       //Creación de un objeto tipo Persona
       
       //Definición de la variable tipo Persona
       Persona persona1;
       
       //Instanciando (Creando un Objeto de la clase Persona)
       persona1 = new Persona();
       
       //Accedemos al objeto persona, y llamamos al Metodo desplegarNombres
        persona1.desplegarNombres();
        
        //Modificamos los valores de los atributos del Objeto Persona
        persona1.nombre = "Enrique";
        persona1.apellido = "Granados";
        
        //Volvemos a imprimir los valores
        System.out.println("");
        persona1.desplegarNombres();
                
        System.out.println("");
        //Creación de un segundo Objeto de tipo persona
        Persona persona2 = new Persona();
        
        persona2.nombre = "Karla";
        persona2.apellido = "Gomez";
        
        persona2.desplegarNombres();
        
                

        
    }

}
