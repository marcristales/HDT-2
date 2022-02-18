
/**
 * @author mario
 *
 */
public interface IPosfixCalc {

	/***
	 * Este metodo es usado para evaluar la expresion postfix
	 * @param es la expresion, como: 1 2 + 4 * 3 +
	 * @return la evaluacion de la expresion
	 */
	int Evaluate(String expresion);
	
}
