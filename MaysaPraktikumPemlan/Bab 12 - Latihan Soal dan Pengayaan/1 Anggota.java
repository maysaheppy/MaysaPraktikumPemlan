package LatihanPerpustakaan;

import java.util.ArrayList;
import java.util.List;

public class Anggota{
  private String nama;
  private String nomorAnggota;
  private List<Buku> riwayatPeminjaman;

  public Anggota() {

  }

  public Anggota (String nama, String nomorAnggota) {
    this.nama = nama;
    this.nomorAnggota = nomorAnggota;
    riwayatPeminjaman = new ArrayList<>();
  }

  public void setNama(String nama) {
      this.nama = nama;
  }
  public void setNomorAnggota(String nomorAnggota) {
      this.nomorAnggota = nomorAnggota;
  }

  public String getNama() {
      return nama;
  }
  public String getNomorAnggota() {
      return nomorAnggota;
  }

  public List<Buku> tambahRiwayat(Buku dipinjam) {
    riwayatPeminjaman.add(dipinjam);
    return riwayatPeminjaman;
  }


  public void showdata(Anggota anggota) {
    System.out.println("==Riwayat peminjaman Buku oleh " + anggota.getNama() + "==");
    int i = 1;
    for( Buku buku : anggota.riwayatPeminjaman) {
      System.out.println(i + ". " + buku.getJudul());
      i++;
    }
  }

  public void lihatPinjam(Buku dipinjam) {
    boolean bener = false;
    for( Buku buku : riwayatPeminjaman) {
      if (buku.getJudul().equals (dipinjam.getJudul())) {
        dipinjam.bukuKembali();
        bener = true;
      }
    }

    if(bener == true) {
      System.out.println("Buku \'" + dipinjam.getJudul() + "\' berhasil dikembalikan oleh " + getNama());
    } else {
      System.out.println("Buku \'" + dipinjam.getJudul() + "\' sedang tidak dipinjam oleh anggota tersebut");
    }
  }
}