package Praktikum7;

public class SalariedEmployee extends Employee {
    private double weeklySalary; //gaji/minggu
    public SalariedEmployee(String name, String noKTP, int tahun, int bulan, int tanggal, double salary) {
        super(name, noKTP, tahun, bulan, tanggal);
        setWeeklySalary(salary);
    }
    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public double earnings() {
        return (super.earnings() + getWeeklySalary());
    }
    public String toString() {
        return String.format("Salaried employee: " + super.toString() + "\nweekly salary: " + getWeeklySalary());
    }
}
