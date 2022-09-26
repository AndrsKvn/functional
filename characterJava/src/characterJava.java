public class characterJava {
    public static void main(String[] args) {
        new Thread (() -> {
            char a ='A';
            System.out.println("Karakter dalam variable a adalah: "+a);
            System.out.println("----------Using UNICODE---------");
            char c = 65;
            System.out.println("Karakter 1: "+c);
            System.out.println("Karakter 2: "+c);

        }).start();
    }
}