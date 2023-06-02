package LatihanPerpustakaan;

public class Main {
  public static void main(String[] args) {

    Perpustakaan perpus = new Perpustakaan();
    //Menambahkan anggota baru
    Anggota Maysa = new Anggota("Maysa", "1306");
    Anggota Sunona = new Anggota("Sunona", "0608");
    Anggota Senan = new Anggota("Senan", "0606");
    Anggota Alvian = new Anggota("Alvian", "1308");
      

    //Menambahkan buku
    Buku TulisanSastra = new Buku("Tulisan Sastra", "Tenderlova", "Fiksi", "Indonesia", "Lovrinz Publishing", 20200, 345);
    Buku AnimalFarm = new Buku("Animal Farm", "George Orwell", "Fiksi", "Indonesia", "Immortal Publishing", 2021, 161);
    Buku LePetitPrince = new Buku("Le Petit Prince", "Antoine De Saint-Exupery", "Fiksi", "Indonesia", "Gramedia Pustaka Utama", 2011, 120);
    Buku Loversation = new Buku("Loversation", "Valerie Patkat", "Fiksi", "Indonesia", "Bhuana Sastra", 2023, 454);
    Buku DuniaSophie = new Buku("Dunia Sophie", "Jostein Gaarder", "Filsafat", "Indonesia", "Mizan Pustaka 2014", 2018, 800);
    Buku SaltToTheSea = new Buku("Salt To The Sea", "Ruta Sepetys", "Fiksi Sejarah", "Indonesia", "Elex Media Komputindo", 2018, 369);
    Buku AntologiBulanDesember = new Buku("Antologi Bulan Desember", "Tenderlova", "Fiksi", "Indonesia", "Lovrinz Publishing", 2023, 325);

    System.out.println("\n====================================================================");
    System.out.println("Meminjam Buku yang belum dipinjam");
    System.out.println("====================================================================");
    perpus.pinjamBuku(TulisanSastra, Maysa);
    perpus.pinjamBuku(AntologiBulanDesember, Alvian);
    perpus.pinjamBuku(Loversation, Sunona);
    perpus.pinjamBuku(AnimalFarm, Senan);
    perpus.pinjamBuku(LePetitPrince, Alvian);
    perpus.pinjamBuku(SaltToTheSea, Sunona);
    perpus.pinjamBuku(DuniaSophie, Alvian);

    System.out.println("\n====================================================================");
    System.out.println("Meminjam Buku yang sudah dipinjam oleh anggota lain");
    System.out.println("====================================================================");
    perpus.pinjamBuku(AnimalFarm, Alvian);
    perpus.pinjamBuku(AntologiBulanDesember, Maysa);
    perpus.pinjamBuku(LePetitPrince, Alvian);

    System.out.println("\n====================================================================");
    System.out.println("Mengembalikan Buku sesuai yang dipinjam sebelumnya");
    System.out.println("====================================================================");
    perpus.kembalikanBuku(AntologiBulanDesember, Alvian);
    perpus.kembalikanBuku(TulisanSastra, Maysa);
    perpus.kembalikanBuku(AnimalFarm, Senan);
    perpus.kembalikanBuku(Loversation, Sunona);

    System.out.println("\n====================================================================");
    System.out.println("Mengembalikan Buku yang tidak dipinjam sebelumnya");
    System.out.println("====================================================================");
    perpus.kembalikanBuku(AntologiBulanDesember, Maysa);
    perpus.kembalikanBuku(AnimalFarm, Alvian);
    perpus.kembalikanBuku(SaltToTheSea, Alvian);

    System.out.println("\n====================================================================");
    System.out.println("Menampilkan riwayat peminjaman buku");
    System.out.println("====================================================================");
    Maysa.showdata(Maysa);
    Sunona.showdata(Sunona);
    Senan.showdata(Senan);
    Alvian.showdata(Alvian);
  }
}
