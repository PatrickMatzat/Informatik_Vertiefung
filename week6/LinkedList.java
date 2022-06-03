public class LinkedList<T> {
    
    //Attribute
    private ListElem head;
    private ListElem tail;

    private class ListElem {
        T data;
        ListElem next;
        
  
        ListElem(T data) {
            this.data = data;
            this.next = null;
        }

        ListElem(T data, ListElem next) {
            this.data = data;
            this.next = next;
        }
    }

    //Konstruktor erzeugt eine leere Liste
    public LinkedList() {  
        this.head = null;
        this.tail = null;
    }

    public T getHead(){
        //Get Head element
        return this.head.data;
    }

    public T getTail(){
        //Get Tail element
        return this.tail.data;
    }

    public T get(int pos){
        //Get element of list in position pos
        ListElem node = this.head;
        if (node.data == null) return null;
        while(pos>0){
            if(node.next == null){
                return null;
            }else {
                node = node.next;
            }
            --pos;
        }
        return node.data;
    }
	
	public void addHead(T val) {
        //Add val in Head of list
        ListElem node = new ListElem(val, this.head);
        if(this.head == null){
            this.tail = node;
        }
        this.head = node;
	}
	
	public void addTail(T val) {
        //Add val in Tail of list
        ListElem node = new ListElem(val);
        if(this.head == null){
            this.head = node;
        }
        this.tail.next = node;
        this.tail = node;
	}
	
	public void add(T val, int pos) {
        //Add Element val in position pos
		ListElem node = new ListElem(val);
        ListElem aux = this.head;
        //Add pos 0
        if(pos == 0){
            this.head = node;
            node.next = aux;
            return;
        }
        //List void
        if(aux == null){
            this.head = node;
            this.tail = node;
            return;
        }
        //Last node
        if(pos == 1 && aux.next == null) this.tail = node;
        while(pos>1){
            if(aux.next == null) {
                //Listenende früher erreicht
                aux.next = node;
                this.tail = node;
                return;
            }
            aux = aux.next;
            --pos;
        }
        node.next = aux.next;
        aux.next = node;

	}
	
	public T removeHead() {
		//Remove Head element and return removed element
        if(this.head != null){
            this.head = this.head.next;
        }
        return this.head.data;
	}
	
	public T removeTail() {
		//Remove Tail element and return removed element
        ListElem node = this.head;
        while(node.next != this.tail){
            node = node.next;
        }
        this.tail = node;
        T data = node.next.data;
        node.next = null;
        return data;
	}
	
	public T remove(int pos) {
        //Remove element in Position pos and return removed element
		ListElem node = this.head;
        if(node == null) return null; //empty list

        if(pos == 0){ //Remove first element
            if(this.head.next == null) this.tail = null; //If Only element
            this.head = this.head.next;
            return node.data;
        }
        while(pos>1){
            node = node.next;
            --pos;
        }
        T data = node.next.data;
        if(node.next == null){ //Next node empty case.
            return null; //Offset element not being removed. (No list change)
        }
        if(node.next.next == null){ //Last element being removed
            this.tail = node;   //Then tail is previous node
        }
        node.next = node.next.next;
        return data;

	}
	
	public boolean isEmpty() {
        //Returns 1 if empty or 0 if not.
        return this.head == null;
	}
	
	public void clear() {
		//Clears list
        this.head = null;
        this.tail = null;
	}
	
	public int size() {
		ListElem node = this.head;
        int size = 1;
        if(isEmpty()) return 0;
        while(node.next != null){
            node = node.next;
            size++;
        }
        return size;
	}
	
	public int find(T obj) {
		//Find element position
        int pos = 0;
        ListElem node = this.head;
        while(node!=null){
            if(node.data == obj) return pos;
            ++pos;
            node = node.next;
        }
        return -1;
	}

    // TODO
    
}
