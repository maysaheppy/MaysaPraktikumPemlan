package Praktikum7;

public class Commission extends Employee {
    private double grossSales;//penjualan per minggu
    private double commissionRate;//komisi

    public Commission(String name, String noKTP, int tahun, int bulan, int tanggal, double sales, double rate){
        super(name, noKTP, tahun, bulan, tanggal);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    public void setGrossSales(double sales){
        grossSales = sales;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setCommissionRate(double rate){
        commissionRate = rate;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
     public double earnings(){
        return super.earnings() + getCommissionRate() * getGrossSales();
    }
    public String toString(){
        return String.format("Commision employee: " + super.toString()+"\ngross sales: "+getGrossSales()+"\ncommission rate: "+getCommissionRate());
    }
}
