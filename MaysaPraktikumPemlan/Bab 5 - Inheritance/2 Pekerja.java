import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia{
    private double gaji, bonus;
    private LocalDate TahunMasuk;
    private int JumlahAnak;

    public Pekerja(String Nama, boolean JenisKelamin, String NIK, boolean Menikah, double Pendapatan, double gaji, int JumlahAnak, int Tahun, int Bulan, int Hari){
        super(Nama, JenisKelamin, NIK, Menikah, Pendapatan);
        this.gaji = gaji;
        this.JumlahAnak = JumlahAnak;
        TahunMasuk = LocalDate.of(Tahun, Bulan, Hari);
        getGaji();
    }

    public void setGaji(double gaji){
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate TahunMasuk){
        this.TahunMasuk = TahunMasuk;
    }

    public void setJumlahAnak( int JumlahAnak){
        this.JumlahAnak = JumlahAnak;
    }

    public LocalDate getTahunMasuk(){
        return TahunMasuk;
    }

    public int getJumlahAnak(){
        return JumlahAnak;
    }

    public double getBonus(){
        int LamaKerja;
        LocalDate Jigeum = LocalDate.now();
        Period beda = Period.between(TahunMasuk, Jigeum);
        LamaKerja = beda.getYears();
        if(0 <= LamaKerja && LamaKerja < 5){
            bonus = gaji * 0.05;
        } else if(5 <= LamaKerja && LamaKerja <10){
            bonus = gaji * 0.1;
        }else if(LamaKerja > 10){
            bonus = gaji * 0.15;
        }
        return bonus;
    }

    public double getGaji(){
        double a = JumlahAnak * 20;
        getBonus();
        double b = a + gaji + bonus;
        super.setTunjangan(b);
        super.getPendapatan();
        return gaji;
    }

    public String toString(){
        return super.toString() + "\nTahun Masuk: " + TahunMasuk + "\nJumlah Anak: " + JumlahAnak + "\nGaji: $" + gaji;
    }
}
