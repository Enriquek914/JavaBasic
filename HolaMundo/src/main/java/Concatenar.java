
public class Concatenar {
    
    public static void main(String[] args) {
        
        String usuario = "Enrique";
        String saludar = "Hola";
        
        System.out.println(saludar+" "+usuario);// Con el signo mas (+) concatena las variables
        
        int a = 5;
        int b = 6;
        
        System.out.println(a+b);
        
        System.out.println(usuario+a+b);
        /*
         Aqui concatena ya que lo primero que encuentra del lado izquierdo es una cadena y
         despues dos datos de tipo Entero. A esto se le conoce como contexto String.
         El resultado seria: Enrique56
         */
        
        System.out.println(b+a+usuario);
       /*
        Este este caso primero realiza la suma de b+a ya que encontro del lado izquierdo datos
        de tipo Entero y luego concatena el dato de tipo String llamado usuario.
        Elresultado seria:11Enrique
        */
       
    }
}
