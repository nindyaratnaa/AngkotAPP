import java.util.LinkedList;

public class Angkot {
    private String jurusan;
    private LinkedList<Pemberhentian> pemberhentianList;

    public Angkot(String jurusan) {
        this.jurusan = jurusan;
        this.pemberhentianList = new LinkedList<>();
    }

    // menambahkan node pemberhentian ke dalam list
    public void tambahPemberhentian(Pemberhentian p) {
        pemberhentianList.add(p);
    }

    public String getJurusan() {
        return jurusan;
    }

    public LinkedList<Pemberhentian> getPemberhentianList() {
        return pemberhentianList;
    }
}