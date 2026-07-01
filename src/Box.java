public class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

    public boolean isEmpty() {
        return this.item == null;
    }
}