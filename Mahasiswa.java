public class Mahasiswa extends Anggota {
    private final String nim;

    public Mahasiswa() {
        super("", "");
        this.nim = "";
    }

    public Mahasiswa(String id, String nama) {
        super(id, nama);
        this.nim = id;
    }

    public Mahasiswa(String id, String nama, String nim) {
        super(id, nama);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public String getKodeJenis() {
        return "M";
    }

    @Override
    public long getMaksHariPinjam() {
        return 7; // Mahasiswa bisa pinjam 7 hari
    }

    @Override
    public long getDendaPerHari() {
        return 1000; // Denda mahasiswa 1000 per hari
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mahasiswa: " + nama + " (NIM: " + id + ") - Jumlah Pinjam: " + jumlahPinjam);
    }

    @Override
    public String toFileString() {
        return nama + ";" + id + ";" + getKodeJenis();
    }
}
