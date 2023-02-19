public class Enclosing {
    static class Nested {
        private long price = 6;

    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);

    }
}
