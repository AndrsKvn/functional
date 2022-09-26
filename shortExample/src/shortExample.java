public class shortExample {
    public static void main(String[] args) {
        new Thread(() ->{
            short min, max;
            min = Short.MIN_VALUE;
            max = Short.MAX_VALUE;
            System.out.println("Minimal size byte: "+min);
            System.out.println("Maximal size byte: "+max);
        }).start();
    }
}