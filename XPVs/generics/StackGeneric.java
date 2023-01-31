package XPVs.generics;

public class StackGeneric <T>{
    int top;
    private T[] data;

    public StackGeneric(int initialCapacit) {
        this.top = 0;
        this.data = (T[]) new Object[initialCapacit];
    }

    void push(T toAdd) {
        if (top == data.length) {
            expandArray();
        }
        else {
            data[top]= toAdd;
            top++;
        }
    }

    T peek() {
        return data[top-1];
    }

    T pop() {
        T tmp = data[top-1];
        top--;
        return tmp;
    }

    void expandArray() {
        T[] tmp = (T[]) new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            tmp[i] = data[i];
        }
        data = tmp;
    }
}
