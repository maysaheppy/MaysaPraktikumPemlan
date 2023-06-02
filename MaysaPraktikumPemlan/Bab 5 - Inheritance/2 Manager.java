public class Manager extends Pekerja{
    private String Departemen;
    private double gaji;
    
    public Manager(String Nama, boolean JenisKelamin, String NIK, boolean Menikah, double Pendapatan, double gaji, int JumlahAnak, int Tahun, int Bulan, int Hari, String Departemen){
        super(Nama, JenisKelamin, NIK, Menikah, Pendapatan, gaji, JumlahAnak, Tahun, Bulan, Hari);
        this.Departemen = Departemen;
        this.gaji = gaji;
        double a = this.gaji *0.1;
        super.setTunjangan(a);
        super.getPendapatan();
    }
    public void setDepartemen( String Departemen){
        this.Departemen = Departemen;
    }

    public String getDepartemen(){
        return Departemen;
    }
    
    public String toString(){
        return super.toString() + "\nDepartemen: " + Departemen;
    }

}
