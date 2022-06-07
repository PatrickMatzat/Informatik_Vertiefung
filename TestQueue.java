public class TestQueue{
	public static void main(String[] args){
		Queue<String> s = new Queue<String>();
		s.enqueue("Erster");
		System.out.println("Das letzte Element in der Queue: " + s.peek());
		s.enqueue("Zweiter");
		System.out.println("Das letzte Element in der Queue: " + s.peek());
		s.enqueue("Dritter");
		System.out.println("Das letzte Element in der Queue: " + s.peek());
		s.enqueue("Vierter");
		System.out.println("Das letzte Element in der Queue: " + s.peek());
		s.enqueue("Fuenfter");
		System.out.println("Das letzte Element in der Queue: " + s.peek());
		System.out.println("Aus der Queue entnommen: " +s.dequeue());
		System.out.println("Aus der Queue entnommen: " +s.dequeue());
		System.out.println("Aus der Queue entnommen: " +s.dequeue());
		System.out.println("Aus der Queue entnommen: " +s.dequeue());
		System.out.println("Aus der Queue entnommen: " +s.dequeue());
		System.out.println("Aus der Queue entnommen: " +s.dequeue());
		System.out.println("Das Element vorne in der Queue: " + s.dequeue());

	}
}
