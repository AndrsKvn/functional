import java.util.ArrayList;

public class arrayListExample {
    public static void main(String[] args) {
        new Thread (() ->{
            ArrayList<String> listString = new ArrayList<String>();
            listString.add("Apple");
            listString.add("Strawberry");
            listString.add("Peach");
            listString.add("Grape");
            System.out.println("Isi ArrayList adalah: "+listString);
        }).start();
    }
}