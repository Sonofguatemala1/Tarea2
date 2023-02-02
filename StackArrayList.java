import java.util.ArrayList;

public class StackArrayList<E> implements Istack<E>
{ 
	protected ArrayList<E> data;

	public StackArrayList()

	{
		data = new ArrayList<E>();
	}
	
	
	/** 
	 * Esta clase hace push, en pocas palabras, agrega un valor en el ultimo espacio del array
	 * @param item
	 */
	public void push(E item)

	{
		data.add(item);
	}

	
	/** 
	 * Esta clase quita el ultimo valor del array y lo devuelve
	 * @return E
	 */
	public E pop()

	{
		return data.remove(size()-1);
	}

	
	/** 
	 * Nos dice el valor del ultimo espacio en el array
	 * @return E
	 */
	public E peek()

	{
		return data.get(size() - 1);
	}
	
	
	/** 
	 * Nos dice el tamaño del array
	 * @return int
	 */
	public int size()

	{
		return data.size();
	}
  
}