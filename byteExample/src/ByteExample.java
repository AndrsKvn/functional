public class ByteExample{
    public static void main(String[] args) {
        new Thread(() ->{
            byte min, max;
            min = Byte.MIN_VALUE;
            max = Byte.MAX_VALUE;
            System.out.println("Minimal size byte: "+min);
            System.out.println("Maximal size byte: "+max);
        }).start();
    }
}