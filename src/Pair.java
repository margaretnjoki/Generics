public class Pair<T, K> {

    private T first;
    private K second;

    public Pair() {
    }

    public void setValues(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    public static Pair<String, Integer> namedScore() {
        Pair<String, Integer> p = new Pair<>();
        p.setValues("Ada", 95);
        return p;
    }
}