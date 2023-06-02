public class MahasiswaFILKOM extends Manusia{
    private String NIM;
    private double IPK;
    private String Angkatan, Prodi;
    private double Beasiswa;

    public MahasiswaFILKOM(String Nama, boolean JenisKelamin, String NIK, boolean Menikah, double Pendapatan, String NIM, double IPK){
        super(Nama, JenisKelamin, NIK, Menikah, Pendapatan);
        this.NIM = NIM;
        this.IPK = IPK;
        getBeasiswa();
        setTunjangan(Beasiswa);
        getPendapatan();
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void setIPK(double IPK){
        this.IPK = IPK;
    }

    public String getNIM(){
        return NIM;
    }

    public double getIPK(){
        return IPK;
    }

    public String getStatus(){
        String a = NIM.substring(0,2);
        Angkatan = "20" + a;
        
        String b = NIM.substring(6, 7);
        switch(b){
            case "2":
            Prodi = "Teknik Informatika";
            break;

            case "3":
            Prodi = "Teknik Komputer";
            break;

            case "4":
            Prodi = "Sistem Informasi";
            break;

            case "6":
            Prodi = "Pendidikan Teknologi Informasi";
            break;

            case "7":
            Prodi = "Teknologi Informasi";
            break;

            default:
            Prodi = "Tidak Teridentifikasi";
        }
        
        return Prodi + ", " + Angkatan;
    }

    public double getBeasiswa(){
        if(3.0 < IPK && IPK< 3.5){
            Beasiswa = Beasiswa + 50;
        } else if( 3.5 < IPK && IPK< 4){
            Beasiswa = Beasiswa + 75;
        }
        return Beasiswa;
    }

    public String toString(){
        return super.toString() + "\n" + "nim: " + getNIM() + "\n" + "ipk: " + getIPK() + "\n" + "status: " + getStatus();
    }
}
