
public class CaracteresEspeciales {
    
    public static void main(String[] args) {
        
        //CARACTERES ESPECIALES EN JAVA
       
       String nombre = "Enrique";
       String apellido = "Granados";
       
        System.out.println(nombre+" "+apellido); 
        System.out.println("");
        /*
         1. El caracter especial de esta línea el espacio que hay dentro de la comillas.
            Al ejecutar nos muestra lo siguiente: Enrique Granados
        */
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("");
        /*
         2. Para este caso nuestro caracter especial es nuestro salto de linea que se
            identifica asi: \n
            Al ejecutar nos muestra lo siguiente: Nueva linea
                                                  Enrique
        */
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("");
        /*
         3.Este caracter \t identificado como tabulador, como bien se nombra tabula la información
           o datos. Organiza los datos.
           Al ejecutar nos muestra lo siguiente:Tabulador:    Enrique
        */
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("");
        /*
         4. El caracter de retroceso lo que hace es que corre hacia la izquierda un renglon 
            (o va hacia atras). En este caso el nombre queda pegado a los dos puntos ya que
            con el caracter retroceso quita el espacio que habia antes.
            Al ejecutar nos muestra lo siguiente: Retroceso:Enrique
        */
        System.out.println("Retorno de carro: \r" + nombre);
        System.out.println("");
        /*
          5. Este caracter representa un retorno al inicio de línea.
             Al ejecutar nos muestra lo siguiente: Retorno de carro:
                                                   Enrique
                                                   
        */
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("");
        /*
          6. El caracter comilla simple se va a mostrar al principio y final de nombre
             Al ejecutar nos muestra lo siguiente: Comilla simple: 'Enrique'
        */
        System.out.println("Comilla doble: \"" + nombre + "\"");
        System.out.println("");
        /*
          7. El caracter comilla doble se va a mostrar al principio y final de nombre
             Al ejecutar nos muestra lo siguiente: Comilla doble: "Enrique"
        */
    }
}
