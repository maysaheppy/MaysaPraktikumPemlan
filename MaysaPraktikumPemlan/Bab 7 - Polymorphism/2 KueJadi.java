package Praktikum7.TugasPRaktikum;

public class KueJadi extends Kue{
    private double jumlahKue;

    public KueJadi(String nama, double harga, double jumlahKue) {
        super(nama, harga);
        setJumlahKue(jumlahKue);
    }

    public void setJumlahKue(double jumlahKue) {
        this.jumlahKue = jumlahKue;
    }

    public double getJumlahKue() {
        return jumlahKue;
    }

    public double hitungHarga() {
        return getHarga() * jumlahKue * 2;
    }

    public String toString() {
        return String.format("--Kue Jadi \n" + super.toString() + " per pcs\nJumlah Kue: " + getJumlahKue() + "\n");
    }
}
