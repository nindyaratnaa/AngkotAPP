public class Pemberhentian {
    private String namaLokasi;
    private String jamLewat; // format "HH:mm, HH:mm, ..."

    public Pemberhentian(String namaLokasi, String jamLewat) {
        this.namaLokasi = namaLokasi;
        this.jamLewat = jamLewat;
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public String getJamLewat() {
        return jamLewat;
    }

    @Override
    public String toString() {
        return namaLokasi + " (Jam: " + jamLewat + ")";
    }
}
