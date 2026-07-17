public abstract class Anggota {
    protected String id;
    protected String nama;
    protected int jumlahPinjam = 0;

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public String getIdAnggota() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void tambahPinjam() {
        jumlahPinjam++;
    }

    public void kurangiPinjam() {
        if (jumlahPinjam > 0) {
            jumlahPinjam--;
        }
    }

    public void pinjamBuku(Buku buku) {
        tambahPinjam();
    }

    // Wajib dioverride oleh Mahasiswa dan Dosen
    public abstract long getMaksHariPinjam();

    public abstract long getDendaPerHari();

    public long hitungDenda(long hariTerlambat) {
        if (hariTerlambat > 0) {
            return hariTerlambat * getDendaPerHari();
        }
        return 0;
    }

    // Wajib dioverride oleh Mahasiswa dan Dosen
    public abstract String getKodeJenis();

    public void tampilkanInfo() {
        System.out.println(id + " - " + nama +
                " (Jumlah Pinjam: " + jumlahPinjam + ")");
    }

    public String toFileString() {
        return nama + ";" + id + ";" + getKodeJenis();
    }
}