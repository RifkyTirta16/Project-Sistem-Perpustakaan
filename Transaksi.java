// ada 3 oop encapsulation, constructor, dan polymorphism

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Transaksi {
    // encapsulation
    private static int counter = 0;

    private final String idTransaksi;
    private final Buku buku;
    private final Anggota peminjam; 
    private final LocalDate tanggalPinjam;
    private LocalDate tanggalKembali; // null selama buku belum dikembalikan
    private boolean sudahKembali;
    // constructor
    public Transaksi(Buku buku, Anggota peminjam) {
        counter++;
        this.idTransaksi = "TRX" + counter;
        this.buku = buku;
        this.peminjam = peminjam;
        this.tanggalPinjam = LocalDate.of(2023, 1, 1); // Ganti dengan tanggal pinjam yang sesuai
        this.sudahKembali = false;
    }
    // encapsulation: getter
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public Buku getBuku() {
        return buku;
    }

    public Anggota getPeminjam() {
        return peminjam;
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public boolean isSudahKembali() {
        return sudahKembali;
    }

    /**
     * Menandai buku dikembalikan hari ini, lalu menghitung denda.
     * Return: nominal denda (0 kalau tidak telat).
     */
    
    public double kembalikanBuku() {
        this.tanggalKembali = LocalDate.now();
        this.sudahKembali = true;
        buku.tambahStok();

        long lamaPinjam = ChronoUnit.DAYS.between(tanggalPinjam, tanggalKembali);
        long maksHari = peminjam.getMaksHariPinjam();
        long hariTerlambat = lamaPinjam - maksHari;


        return peminjam.hitungDenda(hariTerlambat);
    }
    // polymorphism: override 
    @Override
    public String toString() {
        String status = sudahKembali ? "Sudah kembali (" + tanggalKembali + ")" : "Sedang dipinjam";
        return idTransaksi + " | " + buku.getJudul() + " dipinjam oleh " + peminjam.getNama()
                + " sejak " + tanggalPinjam + " | " + status;
    }
}
