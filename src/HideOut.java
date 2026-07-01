public class HideOut<T> {

    private T item;

    public void putIntoHideOut(T toHide) {
        this.item = toHide;
    }

    public T takeFromHideout() {
        T temp = this.item;
        this.item = null;
        return temp;
    }

    public boolean isInHideout() {
        return this.item != null;
    }
}