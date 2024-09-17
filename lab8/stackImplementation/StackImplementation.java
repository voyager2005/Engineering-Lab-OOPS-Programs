package lab8.stackImplementation;

public class StackImplementation {
	int capacity = 5;
	int[] stack = new int[capacity];
	int top = -1;
	
	void push(int item) {
        try {
            if (top >= capacity - 1) {
                throw new ArrayIndexOutOfBoundsException("Stack overflow: Cannot push " + item);
            }
            stack[++top] = item;
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println(exp.getMessage());
        }
    }
	
	int pop() {
        try {
            if (top < 0) {
                throw new ArrayIndexOutOfBoundsException("Stack underflow: Cannot pop");
            }
            return stack[top--];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
		

	public void display() {
		for(int i = top; i > 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
