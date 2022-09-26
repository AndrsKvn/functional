public class Main {
    public static void main(String[] args) {
        Sapa sapa = new Sapa() {
            @Override
            public void sayHi() {
                System.out.println("Good Morning, Kevin");
            }
        };
        sapa.sayHi();
    }
        public interface Sapa{
            public void sayHi();

    }
}