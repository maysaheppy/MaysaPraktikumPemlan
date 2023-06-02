package Praktikum7.TugasPRaktikum;

public class KuePesanan extends Kue{
    private double beratKue;

    public KuePesanan(String nama, double harga, double beratKue){
        super(nama, harga);
        setBeratKue(beratKue);
    }

    public void setBeratKue(double beratKue) {
        this.beratKue = beratKue;
    }

    public double getBeratKue() {
        return beratKue;
    }

    public double hitungHarga(){
        return getHarga() * beratKue;
    }

    public String toString() {
        return String.format("--Kue Pesanan \n" + super.toString() + " per gram\nBerat Kue: " + getBeratKue() + " gram\n");
    }
}
