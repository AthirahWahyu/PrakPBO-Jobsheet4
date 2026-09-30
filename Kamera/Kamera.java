public class Kamera {
    private String idKamera;
    private String merk;
    private String tipe;
    private double hargaSewaPerHari;

    // Constructor 
    public Kamera(String idKamera, String merk, String tipe, double hargaSewaPerHari) {
        this.idKamera = idKamera;
        this.merk = merk;
        this.tipe = tipe;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    // Setter dan Getter
    public String getIdKamera() {
        return idKamera;
    }

    public void setIdKamera(String idKamera) {
        this.idKamera = idKamera;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }

    public void setHargaSewaPerHari(double hargaSewaPerHari) {
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    // Method menampilkan info kamera 
    public void tampilkanInfoKamera() {
        System.out.println("[" + idKamera + "] " + merk + " " + tipe + " - Rp " + hargaSewaPerHari + "/hari");
    }
}
