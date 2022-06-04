import java.util.List;

public class TestLinkedList{

    // Bekommt eine LinkedList uebergeben und printet alle ELemente auf die Konsole
    public static<T> void printList(LinkedList<T> list) {
    	for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }

    // Bekommt eine LinkedList und einen Index uebergeben und entfernt (und printet)
    // aus der LinkedList das Element an Index i. Gibt ggf. eine Fehlermeldung aus.
    public static<T> void removeAtIndex(LinkedList<T> list, int index) {
        T elem = list.remove(index);
        if(elem == null){
            System.out.println("Warning: No index available in given list.");
        }else{
            System.out.println(elem);
        }
    }


    // Testet die statischen Methoden sowie die Listenmethoden direkt
    public static void main(String[] args){

        //Erzeugen ein LinkedList-Objekt mit Namen
        LinkedList<String> listNames = new LinkedList();
        listNames.addTail("c");
        listNames.addTail("d");
        listNames.addHead("a");
        listNames.add("b",1);

        //Erzeugen ein LinkedList-Objekt mit Nummer
        LinkedList<Integer> numbers = new LinkedList();
        numbers.addTail(3);
        numbers.addTail(4);
        numbers.addHead(1);
        numbers.add(2,1);

        //Print Namen Liste
        System.out.println("Names List:");
        printList(listNames);

        System.out.println();

        //Print Nummer Liste
        System.out.println("Numbers List:");
        printList(numbers);

        System.out.println();

        System.out.println("Removing Name with index 1 of Names list: ");
        removeAtIndex(listNames, 1);
        System.out.println("Removing Number with index 1 of Numbers list: ");
        removeAtIndex(numbers, 1);

        //Print Namen Liste after removing index 1
        System.out.println("Names List:");
        printList(listNames);
        System.out.println();

        //Print Nummer Liste after removing index 1
        System.out.println("Numbers List:");
        printList(numbers);
        System.out.println();

        System.out.println("Find a in Names List: "+listNames.find("a"));
        System.out.println("Find b in Names List: "+listNames.find("b"));
        System.out.println("Find 4 in Numbers List: "+numbers.find(4));
        System.out.println("Find 2 in Numbers List: "+numbers.find(2));

        System.out.println("Removing Last Name of List...");
        listNames.removeTail();
        System.out.println("Removing First Number of List...");
        numbers.removeHead();

        System.out.println("Last Name after removing Tail: " + listNames.getTail());
        System.out.println("First Number after removing Head: " + numbers.getHead());

        listNames.clear();

        System.out.println("Is Names list empty after clear? " + listNames.isEmpty());
        System.out.println("Is Numbers list empty without a clear? " +  numbers.isEmpty());

    }
}
