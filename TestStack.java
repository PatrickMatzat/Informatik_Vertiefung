public class TestStack{
	public static void main(String[] args){
		Stack<String> s = new Stack<String>();
		s.push("Erster");
		System.out.println("Das Element oben auf dem Stack ist: " + s.top());
		s.push("Zweiter");
		System.out.println("Das Element oben auf dem Stack ist: " + s.top());
		s.push("Dritter");
		System.out.println("Das Element oben auf dem Stack ist: " + s.top());
		s.push("Vierter");
		System.out.println("Das Element oben auf dem Stack ist: " + s.top());
		s.push("Fuenfter");
		System.out.println("Das Element oben auf dem Stack ist: " + s.top());
		System.out.println("Aus dem Stack entnommen: " +s.pop());
		System.out.println("Aus dem Stack entnommen: " +s.pop());
		System.out.println("Aus dem Stack entnommen: " +s.pop());
		System.out.println("Aus dem Stack entnommen: " +s.pop());
		System.out.println("Aus dem Stack entnommen: " +s.pop());
		System.out.println("Aus dem Stack entnommen: " +s.pop());
		System.out.println("Das Element oben auf dem Stack ist: " + s.top());

	}
}