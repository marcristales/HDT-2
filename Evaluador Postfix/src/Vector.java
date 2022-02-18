import java.util.*;


/**
 * @author mario
 *
 * @param <T>
 */
public class Vector<T> implements IStack<T>, IPosfixCalc {

	Stack<T> pila = new Stack();
	
	@Override
	public int Evaluate(String expresion) {
		
		//op1 es el primer numero ingresado en la pila, op2 es el siguiente ingresado, resultado es el resultado de la expresion.
		int op1, op2, resultado = 0;
		//token es un String vacío donde se guardarán los caracteres de la expresion ingresada
		String token;
		Vector<Integer> stack = new Vector();
		
		//escanea el string de la expresion para conseguir los caracteres
		Scanner scan = new Scanner(expresion);
		
		//si hay todavía caracteres sigue realizando los cálculos
		while (scan.hasNext()) 
		{
			//token obtiene el siguiente caracter
			token = scan.next();
			
			//si el token es un operador, se evalua la expresion
			
			
		}
		
		return resultado;
		
	}
	
	@Override
	public void push(T value) {
		pila.push(value);
	}

	@Override
	public T pull() {
		// TODO Auto-generated method stub
		return pila.pop();
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return pila.peek();
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return pila.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return pila.isEmpty();
	}

	
	
}
