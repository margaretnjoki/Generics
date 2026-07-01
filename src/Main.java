public class Main {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        System.out.println(b1.isEmpty());   // true
        b1.put("gift");
        System.out.println(b1.get());       // gift

        Box<Integer> b2 = new Box<>();
        b2.put(42);
        System.out.println(b2.get());
        System.out.println();
        HideOut<String> den = new HideOut<>();
        System.out.println(den.isInHideout());   // false
        den.putIntoHideOut("peekaboo");
        System.out.println(den.isInHideout());   // true
        System.out.println(den.takeFromHideout()); // peekaboo
        System.out.println(den.isInHideout());
        System.out.println();
        Pipe<String> pipe = new Pipe<>();

        pipe.putIntoPipe("Alice");
        pipe.putIntoPipe("Bob");
        pipe.putIntoPipe("Carol");

        System.out.println(pipe.takeFromPipe());
        System.out.println(pipe.takeFromPipe());

        pipe.putIntoPipe("David");

        System.out.println(pipe.takeFromPipe());
        System.out.println(pipe.takeFromPipe());
        System.out.println(pipe.takeFromPipe());
        System.out.println();


    }

}
