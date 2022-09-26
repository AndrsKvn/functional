public class floatExample {
    public static void main(String[] args) {
        new Thread(() ->{
            float min, max, positive, negative;
            min = Float.MIN_VALUE;
            max = Float.MAX_VALUE;
            positive = Float.POSITIVE_INFINITY;
            negative = Float.POSITIVE_INFINITY;
            System.out.println("Minimal size float: "+min);
            System.out.println("Maximal size float: "+max);
            System.out.println("Ukuran Positive Float: "+positive);
            System.out.println("Ukuran Negative Float: "+negative);

        }).start();
    }
}