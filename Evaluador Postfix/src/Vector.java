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
			if (esOperador(token)) 
			{
				//se jalan los numeros de la pila
				op2 = (stack.pull()).intValue();
				op1 = (stack.pull()).intValue();
				
				resultado = operaciones(token.charAt(0), op1, op2);
				
			} else 
			{
				//si el caracter es un numero lo ingresa a la pila
				try 
				{
					stack.push(Integer.parseInt(token));
				} catch (NumberFormatException e)
				{
					System.out.println("Solo se aceptan operadores aritméticos o enteros");
					break;
				}
				
			}
			
		}
		
		return resultado;
		
	}
	
	/**
	 * este metodo privado evalua si el siguiente caracter es un operador, ej.: +
	 * @param el siguiente caracter
	 * @return true o false
	 */
	private boolean esOperador(String token) {
		
		return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"));
		
	}

	/**
	 * este metodo realiza las operaciones aritméticas
	 * @param detecta que tipo de expresión es a través del operador
	 * @param el primer numero ingresado en la pila
	 * @param el segundo numero ingresado en la pila
	 * @return el resultado de la expresion
	 */
	private int operaciones(char expresion, int op1, int op2) {
		
		int resultado = 0;
		
		//segun el operador ingresado, se realiza esa operación
		switch(expresion) 
		{
		
		case '+':
			resultado = op1 + op2;
		break;
		
		case '-':
			resultado = op1 - op2;
		break;
		
		case '*':
			resultado = op1 * op2;
		break;
		
		case '/':
			
			try 
			{
				resultado = op1 / op2;
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("No se puede dividir dentro de 0");
			}
			
		break;
		
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
