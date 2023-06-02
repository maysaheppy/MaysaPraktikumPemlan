package LatihanPerpustakaan;

public class Perpustakaan implements Peminjaman {

  Perpustakaan() {

  }
  @Override
  public void pinjamBuku(Buku buku, Anggota anggota) {
    if(buku.getDipinjam() == true) {
      System.out.println("Buku \'" + buku.getJudul() + "\' sedang dipinjam oleh anggota lain.");
    }else {
      anggota.tambahRiwayat(buku);
      buku.bukuDipinjam();
      System.out.println("Buku \'" + buku.getJudul() + "\' berhasil dipinjam oleh " + anggota.getNama() + ".");
    }
  }

  @Override
  public void kembalikanBuku(Buku buku, Anggota anggota) {
    anggota.lihatPinjam(buku);
  }
}
