public class Outer {
    private String greeting = "Hi";

    protected class Inner {
        public int repeart = 3;
        public void go() {
            for (int i = 0; i < repeart; i++) {
                System.out.println(greeting);
            }
        }

    }

    public void  callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();
        Inner inner = outer.new Inner();
        inner.go();
    }
}
