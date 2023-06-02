package Praktikum7;

public class BasePlusCommissionEmployee extends Commission {
    private double baseSalary;//gaji pokok tiap minggu

    public BasePlusCommissionEmployee(String name, String noKTP, int tahun, int bulan, int tanggal, double sales, double rate, double salary) {
        super(name, noKTP, tahun, bulan, tanggal, sales, rate);
        setBaseSalary(salary);
    }
    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }
    public String toString() {
        return String.format("Base-Salaried " + super.toString() + "\nbase salary: " + getBaseSalary());
    }
}   
