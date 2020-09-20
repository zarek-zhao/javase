import java.util.Arrays;

public class MyStack {
    private Object[] elements;

    private int index;

    public MyStack(){
        this.elements = new Object[10];
        this.index = -1;
    }

    public void push(Object obj){
        if(this.index >= this.elements.length -1)return;
        elements[++index] = obj;
    }

    public Object pop(){
        Object oldElement = elements[index];
        elements[index--] = null;
        return oldElement;
    }

    public Object[] getElements(){
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "elements=" + Arrays.toString(elements) +
                ", index=" + index +
                '}';
    }
}
