
public class TipoBoolean {
    
     public static void main(String[] args) {

        //boolean
        System.out.println("true tipo boolean: " + Boolean.TRUE);
        System.out.println("false tipo boolean: " + Boolean.FALSE);
        
        boolean booleanVar = false;
        
        if(booleanVar){
            System.out.println("el valor es verdadero");
        }
        else{
            System.out.println("el valor es falso");
        }
        
        System.out.println("");
        
        int edad = 30;
        boolean esAdulto = edad >= 18;
        System.out.println("esAdulto = " + esAdulto);

    }
    
}
