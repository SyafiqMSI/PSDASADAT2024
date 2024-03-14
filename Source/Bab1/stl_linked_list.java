import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> angka = new LinkedList<>();

        // Menambahkan elemen
        for (int i = 0; i < 5; i++) {
            angka.add((i + 1) * 10);
        }

        // Menampilkan elemen dengan loop for-each
        for (int value : angka) {
            System.out.print(value + " ");
        }
    }
}
