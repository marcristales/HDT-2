

import java.io.*;
import java.util.*;

/**
 * @author mario
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Vector<Integer> operando = new Vector ();
		LeerDatos dat = new LeerDatos();
		
		System.out.println("Bienvenido a la calculadora postfix");
		String expresion = dat.leerOperaciones("C:\\Users\\mario\\OneDrive\\Escritorio\\Uni\\TERCER SEMESTRE\\Algoritmos\\Evaluador Postfix\\datos.txt");
		System.out.println(operando.Evaluate(expresion));
		
		
	}

}
