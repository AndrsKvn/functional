public class HelloWorld {
    public static void main(String[] args)
    {
        Sapa sapa = (nama) -> {
            System.out.println("Hello, " +nama);
        };
        sapa.sayHi("Kitty");

    }
    public interface Sapa{
        public void sayHi (String nama);
    }
}