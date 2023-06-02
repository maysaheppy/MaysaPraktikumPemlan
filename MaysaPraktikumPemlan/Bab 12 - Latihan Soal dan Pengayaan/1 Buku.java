package LatihanPerpustakaan;

public class Buku{
  private String judul;
  private String penulis;
  private String kategori;
  private String bahasa;
  private String penerbitan;
  private int tahunTerbit;
  private int halaman;
  private boolean dipinjam = false;

  public Buku() {

  }

  public Buku (String judul, String penulis, String kategori, String bahasa, String penerbitan, int tahunTerbit, int halaman) {
    this.judul = judul;
    this.penulis = penulis;
    this.kategori = kategori;
    this.bahasa = bahasa;
    this.penerbitan = penerbitan;
    this.tahunTerbit = tahunTerbit;
    this.halaman = halaman;
  }

  public void setJudul(String judul) {
      this.judul = judul;
  }
  public void setPenulis(String penulis) {
      this.penulis = penulis;
  }
  public void setKategori(String kategori) {
      this.kategori = kategori;
  }
  public void setBahasa(String bahasa) {
      this.bahasa = bahasa;
  }
  public void setPenerbitan(String penerbitan) {
      this.penerbitan = penerbitan;
  }
  public void setTahunTerbit(int tahunTerbit) {
      this.tahunTerbit = tahunTerbit;
  }
  public void setHalaman(int halaman) {
      this.halaman = halaman;
  }

  public String getJudul() {
      return judul;
  }
  public String getPenulis() {
      return penulis;
  }
  public String getKategori() {
      return kategori;
  }
  public String getBahasa() {
      return bahasa;
  }
  public String getPenerbitan() {
      return penerbitan;
  }
  public int getTahunTerbit() {
      return tahunTerbit;
  }
  public int getHalaman() {
      return halaman;
  }
  public boolean getDipinjam() {
    return dipinjam;
  }
  
  public void bukuDipinjam() {
    dipinjam = true;
  }

  public void bukuKembali() {
    dipinjam = false;
  }
}
