import java.util.stream.*;
    public class Arraypl4 {
        public static void main(String[] args) {
            int[] angkaa =
                    {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32};
            int h = IntStream.of(angkaa).sum();
            System.out.println("Jumlah semua angka adalah :" + h);
        }
    }

