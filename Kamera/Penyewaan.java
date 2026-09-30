import java.util.ArrayList;

public class Penyewaan {
    private String idTransaksi;
    private Pelanggan pelanggan;
    private ArrayList<Kamera> daftarKamera;
    private int lamaSewaHari;

    // Constructor 
    public Penyewaan(String idTransaksi, Pelanggan pelanggan, int lamaSewaHari) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.lamaSewaHari = lamaSewaHari;
        this.daftarKamera = new ArrayList<Kamera>(); // Inisialasisasi ArrayList
    }

    // Method untuk menambah unit kamera yang disewa
    public void tambahKamera(Kamera kamera) {
        daftarKamera.add(kamera);
    }

    // Method untuk menghitung total biaya sewa 
    public double hitungTotalBiaya() {
        double total = 0;
        for (Kamera kamera : daftarKamera) {
            total += kamera.getHargaSewaPerHari() * lamaSewaHari;
        }
        return total;
    }

    // Method untuk mencetak nota sewa
    public void cetakNota() {
        System.out.println("--------------------------------------------");
        System.out.println("            NOTA PENYEWAAN KAMERA           ");
        System.out.println("--------------------------------------------");
        System.out.println("ID Transaksi    : " + idTransaksi);
        System.out.println("Lama Sewa       : " + lamaSewaHari + " Hari");
        System.out.println("---------------------------------------------");
        System.out.println("DATA PELANGGAN  : ");
        pelanggan.tampilkanInfo();
        System.out.println("--------------------------------------------");
        System.out.println("DAFTAR KAMERA YANG DISEWA : ");
        if (!daftarKamera.isEmpty()) {
            for (int i = 0; i < daftarKamera.size(); i++) {
                System.out.print((i + 1) + ". ");
                daftarKamera.get(i).tampilkanInfoKamera();
            }
        } else {
            System.out.println("Belum ada kamera yang dipilih.");
        }
        System.out.println("---------------------------------------------");
        System.out.println("TOTAL BIAYA SEWA : Rp " + hitungTotalBiaya());
        System.out.println("---------------------------------------------\n");
    } 
}
