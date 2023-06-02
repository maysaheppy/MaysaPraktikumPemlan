public class Bab3_Constructor {
    int alas, tinggi;
    String SAlas, STinggi;
    public Bab3_Constructor(int alas){
        this.alas = alas;
    }
    public Bab3_Constructor (int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Bab3_Constructor (String alas, String tinggi){
        this.SAlas = alas;
        this.STinggi = tinggi;
        ubahString();
    }
    public void ubahString(){
        int a = Integer.parseInt(SAlas);
        int b = Integer.parseInt(STinggi);
        this.alas = a;
        this.tinggi = b;
    }

    public void setAlas(int alas){
        this.alas = alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public int getAlas(){
        return alas;
    }
    public int getTinggi(){
        return tinggi;
    }
    public double hitungLuas(){
        double hasil = (double)(getTinggi()*getAlas())/2;
        return hasil;
    }

    public void displayMessage(){
        System.out.println("Hitung Luas : ");
    }
}
