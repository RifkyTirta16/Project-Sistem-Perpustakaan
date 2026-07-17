public class Buku {
    private final String kodeBuku;
    private final String judul;
    private final String penulis;
    private int stok;
    private static int kodeBukuCounter = 0;

    public Buku(String judul, int stok) {
        this(judul, "", stok);
    }

    public Buku(String judul, String penulis, int stok) {
        kodeBukuCounter++;
        this.kodeBuku = "BK" + kodeBukuCounter;
        this.judul = judul;
        this.penulis = penulis;
        this.stok = stok;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getStok() {
        return stok;
    }

    public boolean kurangiStok() {
        if (stok > 0) {
            stok--;
            return true;
        }
        return false;
    }

    public void tambahStok() {
        stok++;
    }

    public String toFileString() {
        return kodeBuku + ";" + judul + ";" + penulis + ";" + stok;
    }

    public static Buku fromFileString(String baris) {
        String[] bagian = baris.split(";");
        String judul = bagian[1];
        String penulis = bagian[2];
        int stok = Integer.parseInt(bagian[3]);
        return new Buku(judul, penulis, stok);
    }

    @Override
    public String toString() {
        return kodeBuku + " | " + judul + " by " + penulis + " | Stok: " + stok;
    }
}
