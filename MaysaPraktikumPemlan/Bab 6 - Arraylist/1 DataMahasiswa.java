package Tugas6;

import java.util.ArrayList;

class DataMahasiswa {

  private static ArrayList<Mahasiswa> mhs = new ArrayList<>();
  private static Mahasiswa mahasiswa1 = new Mahasiswa();

  public static ArrayList<Mahasiswa> tambahMahasiswa(Mahasiswa mhswa){
    mhs.add(mhswa);
    return mhs;
  }

  public static void tampilSemuaData(){
    // Gunakan perulangan
    for (Mahasiswa mahasiswa1 : mhs){
        System.out.println("==== Tampilan Data Mahasiswa " + (mhs.indexOf(mahasiswa1) + 1) + " Filkom UB ====");
        System.out.println("Nama Mahasiswa  : " + mahasiswa1.getNama());
        System.out.println("Jurusan         : " + mahasiswa1.getJurusan());
        if(mahasiswa1.getStatus() == true){
            System.out.println("Status          : Menikah");
        }else{
            System.out.println("Status          : Lajang");
        }
        System.out.println(" ");
    }
  }

  public static Mahasiswa cariMahasiswa(String Nama){
    // Gunakan perulangan
    boolean Ada = false;
    for (Mahasiswa mahasiswa1 : mhs){
        if(Nama.equals(mahasiswa1.getNama())){
            Ada = true;
      }
    }

    if(Ada == true){
      System.out.println("Data mahasiswa atas nama " + Nama+ " ditemukan");
    }else{
      System.out.println("Data mahasiswa atas nama " + Nama + " tidak ditemukan");
    }

    return mahasiswa1;
  }

  public static void tampilMahasiswa(Mahasiswa mahasiswa){
    System.out.println("========================================");
    System.out.println("Nama Mahasiswa  : " + mahasiswa.getNama());
    System.out.println("Jurusan         : " + mahasiswa.getJurusan());
    if(mahasiswa.getStatus() == true){
        System.out.println("Status          : Menikah");
    }else{
        System.out.println("Status          : Lajang");
    }
  }

  public static void updateMahasiswa(Mahasiswa mhsiswa1, Mahasiswa mhsiswa2){
    mhsiswa1.setNama(mhsiswa2.getNama());
    mhsiswa1.setJurusan(mhsiswa2.getJurusan());
    mhsiswa1.setStatus(mhsiswa2.getStatus());
  }
}
