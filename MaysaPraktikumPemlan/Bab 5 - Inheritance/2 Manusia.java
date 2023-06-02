public class Manusia {
    private String Nama, NIK, JK;
    private boolean JenisKelamin, Menikah;
    private double Tunjangan;
    private double Pendapatan = 0;

    public Manusia(){

    }

    public Manusia(String Nama, boolean JenisKelamin){
        this.Nama = Nama;
        this.JenisKelamin = JenisKelamin;
    }
    
    public Manusia(String Nama, boolean JenisKelamin, String NIK, boolean Menikah, double Pendapatan){
        this.Nama = Nama;
        this.JenisKelamin = JenisKelamin;
        this.NIK = NIK;
        this.Menikah = Menikah;
        this.Pendapatan = Pendapatan;

        if(JenisKelamin == true){
            JK = "Laki-laki";
        }else{
            JK = "Perempuan";
        }
        getTunjangan();
    }

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setJenisKelamin(boolean JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }

    public void setNIK(String NIK){
        this.NIK = NIK;
    }

    public void setMenikah(boolean Menikah){
        this.Menikah = Menikah;
    }
    public void setTunjangan(double Tunjangan){
        this.Tunjangan = Tunjangan;
    }


    public String getName(){
        return Nama;
    }

    public boolean getJenisKelamin(){
        return JenisKelamin;
    }

    public String getNIK(){
        return NIK;
    }
    
    public boolean getMenikah(){
        return Menikah;
    }

    public double getTunjangan(){
        if(Menikah == true){
             if(JenisKelamin == true){
            Tunjangan = Tunjangan + 25;
            }else{
                Tunjangan = Tunjangan + 20;
            }
        }else{
             Tunjangan = Tunjangan + 15;
        }
        getPendapatan();

        return Tunjangan;
    }

    public double getPendapatan(){
        Pendapatan = Pendapatan + Tunjangan;
        return Pendapatan;
    }

    public String toString(){
        return ("Nama: " + Nama + 
        "\nNIK: " + NIK + 
        "\nJenis Kelamin: " + JK + 
        "\nPendapatan: $" + Pendapatan);
    }
}

// public class Manusia {
//     private String nama;
//     private boolean jenisKelamin;
//     private String nik;
//     private boolean menikah;
//     private double pendapatan;
//     private double tunjangan;
//     private String jk;
    
//     public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah, double pendapatan){
//         this.nama = nama;
//         this.jenisKelamin = jenisKelamin;
//         this.nik = nik;
//         this.menikah = menikah;
//         this.pendapatan = pendapatan;

//         if(jenisKelamin==true){
//             jk = "Laki -laki";
//         }
//         else{
//             jk = "Perempuan";
//         }

//         getTunjangan();
//     }

//     public void setName(String nama){
//         this.nama = nama;
//     }

//     public void setJenisKelamin(boolean jk){
//         this.jenisKelamin = jk;
//     }

//     public void setNik(String nik){
//         this.nik = nik;
//     }

//     public void setMenikah(boolean mnkh){
//         this.menikah = mnkh;
//     }

//     public String getName(){
//         return nama;
//     }

//     public boolean getJenisKelamin(){
//         return jenisKelamin;
//     }
//     // true = laki - laki
//     // false = perempuan;

//     public String getNik(){
//         return nik;
//     }

//     public boolean getMenikah(){
//         return menikah;
//     }

//     public void setTunjangan(double tunjangan){
//         this.tunjangan = tunjangan;
//     }

//     public double getTunjangan(){
//         // double tunjangan = 0;
//         if(menikah==true){
//             if(jenisKelamin==true){
//                 tunjangan = tunjangan + 25;
//             }
//             else if(jenisKelamin==false){
//                 tunjangan = tunjangan + 20;
//             }
//         }
//         else if(menikah==false){
//             tunjangan = tunjangan + 15;
//         }
//         getPendapatan();

//         return tunjangan;
//     }

//     public double getPendapatan(){
//         pendapatan = pendapatan + tunjangan;
//         return pendapatan;

//     }

//     public String toString(){
//         return "\n" + "nama : " + nama + 
//         "\n" + "nik : " + nik + 
//         "\n" + "jenis Kelamin : " + jk + 
//         "\n" + "pendapatan : $" + pendapatan;
//     }
// }