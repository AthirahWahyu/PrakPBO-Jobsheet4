public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String nomorTelepon;

    // Constructor 
    public Pelanggan(String idPelanggan, String nama, String nomorTelepon) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    // Setter and Getter
    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    // Method menampilkan info pelanggan
    public void tampilkanInfo() {
        System.out.println("ID Pelanggan    : " + idPelanggan);
        System.out.println("Nama            : " + nama);
        System.out.println("No. Telepon     : " + nomorTelepon);
    }
}
