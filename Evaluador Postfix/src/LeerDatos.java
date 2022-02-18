
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author mario
 *
 */
public class LeerDatos {

	
    
    public String leerOperaciones(String Datos){
        String cadena = "";
        File file = new File(Datos);
        
        try 
        {
			Scanner scn = new Scanner(file);
			
			while (scn.hasNextLine())
			{
				cadena = scn.nextLine();
			}
			
		} 
        catch (FileNotFoundException e) 
        {
			e.printStackTrace();
		}
        
        return cadena;
        
    }

    
	
}
