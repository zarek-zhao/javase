public class TestMyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack);
    }
}
