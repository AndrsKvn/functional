public class HelloWorld {
public static void main(String[] args){

    Sapa sapa = () -> {
        System.out.println("Hello World");
    };
    sapa.sayHi();
}
public interface Sapa{
    public void sayHi();
}
}
