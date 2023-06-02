public class Managerr extends Employee {
    private double bonus;

    public Managerr(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day /* , bonus*/);
        bonus = 0;
    }

    public Managerr(String name){
        super(name);
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
}
