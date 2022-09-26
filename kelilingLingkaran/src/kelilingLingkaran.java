public class kelilingLingkaran {
    public static void main(String[] args) {

        DoubleLingkaran dL = (double phi, double r) ->{
            return 2*phi*r;
        };
        System.out.println("Keliling Lingkaran (Double): "+ dL.hitungLingkaran(3.1416, 2.12));

        FloatLingkaran fL = (float phi, float r) -> {
            return 2*phi*r;
        };
        System.out.println("Keliling Lingkaran (Float): "+ fL.hitungLingkaran(3.1416f, 2.12f));

    }

    public interface DoubleLingkaran{
        public double hitungLingkaran(double phi, double r);
    }

    public interface FloatLingkaran{
        public float hitungLingkaran(float phi, float r);
    }
}