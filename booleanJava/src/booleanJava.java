public class booleanJava {
    public static void main(String[] args) {

        BooleanSupplier bs = () -> true;
        System.out.println("NIlai awal: "+bs.getAsBoolean());
        int x = 0, y = 1;
        bs = () -> x > y;
        System.out.println("Nilai setelah dilakukan operasi: "+bs.getAsBoolean());
    }
    public interface BooleanSupplier{
        public boolean getAsBoolean();
    }
}