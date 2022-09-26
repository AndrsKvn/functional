public class HitungTambah {

    public static void main(String[] args) {
        Tambah tambah = (int a, int b) -> {
            System.out.println("Nilai a = " +a);
            System.out.println("Nilai b = " +b);
            return a + b;
        };
        System.out.println("Hasil a + b =  " + tambah.AngkaTambah(10, 2));
    }
    public interface Tambah{
        public int AngkaTambah(int a, int b);
    }
}