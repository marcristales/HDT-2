
/**
 * @author mario
 *
 * @param <T>
 */
public interface IStack<T> {

	/**
	 * @param el valor a hacerle push
	 */
	void push(T value);
	
	T pull();
	
	T peek();
	
	int count();
	
	boolean isEmpty();
	
}
