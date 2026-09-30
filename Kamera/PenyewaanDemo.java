public class PenyewaanDemo {
    public static void main(String[] args) {
        // Instansiasi objek Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("P001", "Nayire Nadine", "09812017310");

        // Instansiasi beberapa objek Kamera
        Kamera kamera1 = new Kamera("K001", "Canon", "EOS 118A", 150000);
        Kamera kamera2 = new Kamera("K002", "Sony", "A7 III", 250000);

        // Instansiasi objek Trasaksi Penyewaan (lama sewa 3 hari)
        Penyewaan sewa1 = new Penyewaan("trx-20260811", pelanggan1, 3);

        // Menambahkan kamera ke transaksi penyewaan
        sewa1.tambahKamera(kamera1);
        sewa1.tambahKamera(kamera2);

        // Mencetak Nota Penyewaan
        sewa1.cetakNota();
    }
    
}
