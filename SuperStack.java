

public class SuperStack<T> {
	private T[] items;
	private int top;
	
	public SuperStack(int size){
		items = (T[]) new Object[size];
	}
	
	public boolean isEmpty() {
		//TODO
		return true;
	}
	
	public boolean isFull() {
		//TODO
		return true;
	}
	
	public boolean push(T item) {
		//TODO
		if(isFull()) {
			return false;
		}
		items[top++] = item;
		return true;
		
	}
	
	public T pop() {
		//TODO
		if(isEmpty())
			return null;
		else { 
			top = top-1;
			return items[top];
		}
	}
}
