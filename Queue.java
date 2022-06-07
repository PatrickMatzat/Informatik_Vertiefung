import java.util.LinkedList;
public class Queue<T>{
	private LinkedList<T> data;

	public Queue(){
		data = new LinkedList<T>();
	}

	public void enqueue(T val){
		data.addFirst(val);
	}

	public T dequeue(){
	if (data.size() == 0){
			return null;
		}
		else{
			return data.removeLast();
		}
	}

	public T peek(){
		return data.getFirst();
	}



}