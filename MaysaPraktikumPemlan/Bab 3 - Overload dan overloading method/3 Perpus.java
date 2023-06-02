import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Perpus {
    private String kategori;
    private String penulis;
    private String judul;
    private String bahasa;
    private String penerbitan;
    private String edisi;
    private int halaman;
    private String[] penulisbanyak;
    private String sinopsis;
    private int jumlahKata;
    private double tingkatKesamaan;
    private int hargaBuku;
    private int persenRoyalti;
    private int Royalti;
    private int Penjualan;


    public Perpus(){

    }
    
    public Perpus(String newKategori, String newPenulis, String newJudul, String newBahasa, String newPenerbitan, String newEdisi, String newHalaman, String newSinopsis){
        
    }

    public String[] getpenulisbanyak() {
        return penulisbanyak;
    }
    public void setPenulisbanyak(String[] s) {
        this.penulisbanyak = s;
    }
    public void setKategori(String s) {
        kategori = s;
    }
    public void setPenulis(String s) {
        penulis = s;
    }
    public String getJudul(){
        return judul;
    }
    public String getPenulis(){
        return penulis;
    }
    public void setJudul(String s) {
        judul = s;
    }
    public void setPenerbitan(String s) {
        penerbitan = s;
    }
    public void setEdisi(String i) {
        edisi = i;
    }
    public void setHalaman(int i) {
        halaman = i;
    }
    public void setBahasa(String s) {
        bahasa = s;
    }
    public void setPenjualan(int i){
        Penjualan = i;
    }
    public void sethargaBuku(int i){
        hargaBuku = i;
    }
    public void setPersenRoyalti(int i){
        persenRoyalti = i;
    }
    public void setSinopsis(String s){
        sinopsis = s;
        hitungKata();
    }
    public void hitungKata(){
        String hitung = sinopsis;
        int count = 0;

        for(int i = 0; i<hitung.length(); i++){
            if(hitung.charAt(i)==' '){
                count++;
            }
        }

        if(count>0){
            count += 1;
        }

        jumlahKata = count;
    }
    public double CekTingkatKesamaan(Perpus obj1){
        int sama = 0;
        if(this.kategori.equals(obj1.kategori)){
            sama ++;
        }

        if(this.penulis.equals(obj1.penulis)){
            sama ++;
        }

        if(this.judul.equals(obj1.judul)){
            sama ++;
        }

        if(this.bahasa.equals(obj1.bahasa)){
            sama ++;
        }

        if(this.penerbitan.equals(obj1.penerbitan)){
            sama ++;
        }
        
        tingkatKesamaan = sama * 20;
        displayTingkatKesamaan(obj1);
        return tingkatKesamaan;
    }
    private void displayTingkatKesamaan(Perpus obj1){
        System.out.println("Tingkat kesamaan : " + tingkatKesamaan + " %");
    }
    public int hitungRoyalti(int harga){
        this.hargaBuku = harga;
        Royalti = (Penjualan * hargaBuku*10)/100;
        return Royalti;
    }
    public int hitungRoyalti(int harga, int persen){
        this.hargaBuku = harga;
        this.persenRoyalti = persen;
        Royalti = (Penjualan * hargaBuku * persenRoyalti)/100;
        return Royalti;
    }
    public void bacaFile(String pathFile){
        try{
            File file = new File(pathFile);
            Scanner Input = new Scanner(file);
            String Isi = Input.nextLine();

            String[] IsiFile = Isi.split("; ");

            this.judul = IsiFile[0];
            this.penulis = IsiFile[1];
            Input.close();
            System.out.println("isi txt: " + Isi);
        } catch (FileNotFoundException exception) {
            System.out.println("File not found: " + exception.getMessage());
        }
    }
    public void simpanFile(String namaFile){
            try{
                BufferedWriter tulis = new BufferedWriter(new FileWriter(namaFile));
                tulis.write(judul + "; " + penulis);
                tulis.close();
                System.out.println("File berhasil disimpan");
            }catch (IOException exception){
                System.out.println("Error : " + exception.getMessage());
            }
        }
    public void displayMessage() {
        System.out.println(judul);
        System.out.println("Informasi Buku: ");
        System.out.println("Kategori : " + kategori);
        if (this.penulisbanyak == null) {
            System.out.println("Penulis : " + penulis);
        } else {
            System.out.println("Penulis : " + Arrays.toString(penulisbanyak).replace("[", "").replace("]",
                    ""));
        }
        System.out.println("Penerbitan : " + penerbitan);
        System.out.println("Edisi : " + edisi);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Bahasa : " + bahasa);
        if(jumlahKata >= 10){
            System.out.println("Sinopsis : " + sinopsis);
        }
        System.out.println("Penjualan bulan ini : " + Penjualan);
        System.out.println("Royalti penulis : " + Royalti);
    }
}
