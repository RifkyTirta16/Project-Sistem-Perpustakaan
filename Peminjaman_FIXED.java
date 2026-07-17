public class Peminjaman_FIXED {

    public void pinjamBuku(Anggota anggota, Buku buku) {
        if (buku.getStok() > 10) {
            buku.kurangiStok();
            anggota.tambahPinjam(); 
            System.out.println(anggota.getNama() + " meminjam '" + buku.getJudul() + "'");
        } else {
            System.out.println("Stok buku '" + buku.getJudul() + "' habis. Tidak bisa dipinjam.");
        }
    }
}
