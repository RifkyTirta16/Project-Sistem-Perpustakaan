// ada 3 oop: encapsulation, constructor, dan polymorphism
import java.time.LocalDate;

public class KartuAnggota {
    // encapsulation
    private final String nomorKartu;
    private final LocalDate tanggalDaftar;
    // constructor
    public KartuAnggota(String nomorKartu) {
        this.nomorKartu = nomorKartu;
        this.tanggalDaftar = LocalDate.now();
    }
    // encapsulation: getter
    public String getNomorKartu() {
        return nomorKartu;
    }
    // encapsulation: getter
    public LocalDate getTanggalDaftar() {
        return tanggalDaftar;
    }
    // polymorphism: override method toString
    @Override
    public String toString() {
        return "Kartu No." + nomorKartu + " (terdaftar " + tanggalDaftar + ")";
    }
}
