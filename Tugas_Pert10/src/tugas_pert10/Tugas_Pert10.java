package tugas_pert10;

/**
 *
 * @author ACER
 */
public class Tugas_Pert10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 5;
        double value = 1000.0;
        int a = 12, b = 18;
        long hasilFaktorial = faktorial(number);
        System.out.println("Faktorial dari " + number + " adalah " + hasilFaktorial);
        double hasilLog = cariLog(value);
        System.out.println("Logaritma basis 10 dari " + value + " adalah " + hasilLog);
        int hasilFpb = fpb(a, b);
        System.out.println("FPB dari " + a + " dan " + b + " adalah " + hasilFpb);
        int hasilKpk = kpk(a, b);
        System.out.println("KPK dari " + a + " dan " + b + " adalah " + hasilKpk);
    }

    public static long faktorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * faktorial(n - 1);
    }
    public static double cariLog(double x) {
        return Math.log10(x);
    }
    public static int fpb(int a, int b) {
        if (b == 0) {
            return a;
        }
        return fpb(b, a % b);
    }
    public static int kpk(int a, int b) {
        return (a * b) / fpb(a, b);
    }
}
