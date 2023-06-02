package Praktikum7;

public class ProductionEmployee extends Employee{
    private double jumlahBarang;
    private double upahBarang;

    public ProductionEmployee(String name, String noKTP, int tahun, int bulan, int tanggal, double jumlahBarang, double upahBarang) {
        super(name, noKTP, tahun, bulan, tanggal);
        setJumlahBarang(jumlahBarang);
        setUpahBarang(upahBarang);
    }

    public void setJumlahBarang(double jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }
    public void setUpahBarang(double upahBarang) {
        this.upahBarang = upahBarang;
    }
    public double getJumlahBarang() {
        return jumlahBarang;
    }
    public double getUpahBarang() {
        return upahBarang;
    }

    public double earnings(){
        return super.earnings() + getJumlahBarang() * getUpahBarang();
    }
    public String toString(){
        return String.format("Production employee: " + super.toString()+"\nJumlah Barang diproduksi: "+getJumlahBarang()+"\nUpah Barang: $"+getUpahBarang());
    }
}
