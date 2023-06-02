package Tugas6;

public class Main {
    public static void main(String[] args) {
        // Lakukan modifikasi data tambah mahasiswa ...
        

        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Denar Abidin", "Pendidikan Teknologi Informasi", false));
        DataMahasiswa.tambahMahasiswa(new Mahasiswa("Grenda Jamaludin", "Ilmu Komputer", true));

        Mahasiswa mhs3 = new Mahasiswa("Andhika Sastra Gautama", "Sistem Informasi", false);
        Mahasiswa mhs4 = new Mahasiswa("Hanan Abinaya", "Ilmu Komputer", true);
        Mahasiswa mhs5 = new Mahasiswa("Pramoedya", "Teknik Informatika", false);
        DataMahasiswa.tambahMahasiswa(mhs3);
        DataMahasiswa.tambahMahasiswa(mhs4);
        DataMahasiswa.tambahMahasiswa(mhs5);

        // Method tampilSemuaData
        DataMahasiswa.tampilSemuaData();
        
        // Method cariMahasiswa (jika data ada)
        DataMahasiswa.cariMahasiswa("Denar Abidin");
    
        // Method cariMahasiswa (jika data tidak ada)
        DataMahasiswa.cariMahasiswa("Maysa Heppy");
    
        // Method tampilMahasiswa (sebelum diupdate)
        DataMahasiswa.tampilMahasiswa(mhs5);
    
        // Method tampilMahasiswa (setelah diupdate)
        Mahasiswa mhs6 = new Mahasiswa("Hilmy Fahreza", "Sistem Informasi", true);


        DataMahasiswa.updateMahasiswa(mhs5, mhs6);
        DataMahasiswa.tampilMahasiswa(mhs5);
    }
  }
