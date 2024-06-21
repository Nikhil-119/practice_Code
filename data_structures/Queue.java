package data_structures;

public class Queue {
	
	int SIZE=5;
	int items[] = new int[SIZE];
	int front,rear;
	
	Queue(){
		front = -1;
		rear = -1;
	}
	
	//To check if Queue is full
	boolean isFull() {
		if(front == 0 && rear == SIZE -1) {
			return true;
		}else {
		return false;
		}
	}
	
	//To check if Queue is empty
	boolean isEmpty() {
		if(front == -1 && rear == -1) {
			return true; 
		}else {
		return false;
		}
	}
	
	//For inserting elements in Queue
	void enQueue(int ele) {
		if(isFull()) {
			System.out.println("\nQueue is full");
		}else if(front == -1 && rear == -1){
			front= rear = 0;
			items[rear]=ele;
			System.out.println("Insert "+ ele +"\n");
		}else {
			rear++;
			items[rear] = ele;
			System.out.println("Insert "+ ele +"\n");
		}
	}
	
	//For removing elements from Queue
	void deQueue() {
		int ele;
		
		if(isEmpty()) { 
			System.out.println("\nQueue is empty");
		}else if(front == rear){
			front = rear = -1;
		}else {
			front++;
		}
	}
	
	//For displaying elements present in Queue
	void display(){
		int i;
	    if(isEmpty()) {
	    	System.out.println("\nQueue is empty");
	    } else {
	    	for(i = front; i <= rear; i++){
	        System.out.println(items[i]);
	        }
	    }
	}
	
	//For checking the front element
	void peak(){
		System.out.println("\nFront value is: " + items[front] +"\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue myQueue = new Queue();
	    
	    myQueue.enQueue(1);
	    myQueue.enQueue(2);
	    myQueue.enQueue(3);
	    myQueue.enQueue(4);
	    myQueue.enQueue(5);

	    myQueue.display();
	    
	    myQueue.peak();
	    
	    myQueue.deQueue();
	    myQueue.deQueue();
	    
	    myQueue.peak();
	    
	    myQueue.display();

	}

}
