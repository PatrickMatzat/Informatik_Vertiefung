import java.util.LinkedList;
public class Stack<T>{
	private LinkedList<T> data;

	public Stack(){
		data = new LinkedList<T>();
	}

	public void push(T val){
		data.addFirst(val);
	}

	public T pop(){
		if (data.size() == 0){
			return null;
		}
		else{
			return data.removeFirst();
		}
	}

	public T top(){
		if (data.size()== 0){
			return null;
		}
		else{
			return data.getFirst();
		}
	}
}