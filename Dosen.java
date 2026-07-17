public class Dosen extends Anggota {
    private final String nip;

    public Dosen() {
        super("", "");
        this.nip = "";
    }

    public Dosen(String id, String nama) {
        super(id, nama);
        this.nip = id;
    }

    public Dosen(String id, String nama, String nip) {
        super(id, nama);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String getKodeJenis() {
        return "D";
    }

    @Override
    public long getMaksHariPinjam() {
        return 30; // Dosen bisa pinjam 30 hari
    }

    @Override
    public long getDendaPerHari() {
        return 500; // Denda dosen 500 per hari
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Dosen: " + nama + " (NIP: " + id + ") - Jumlah Pinjam: " + jumlahPinjam);
    }

    @Override
    public String toFileString() {
        return nama + ";" + id + ";" + getKodeJenis();
    }
}
