import java.util.concurrent.Callable;
public class HelloCallable {
    public static void main(String[] args) {
        try{
            Callable<String> hi = () -> "Hello, Good Morning";
            System.out.println(hi.call());
        }catch(Exception ex){
            System.out.print(ex.getMessage());
        }

    }
}