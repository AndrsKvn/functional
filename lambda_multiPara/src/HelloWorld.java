public class HelloWorld {
    public static void main(String[] args) {
        Sapa sapa = (String nama,String gender) -> {
            System.out.println("Hello " +nama+", anda adalah: " + gender);
        };
        sapa.sayHi("Kitty", "Perempuan");
        System.out.println("Hello world!");
    }
    public interface Sapa{
        public void sayHi(String nama, String gender);
    }
}