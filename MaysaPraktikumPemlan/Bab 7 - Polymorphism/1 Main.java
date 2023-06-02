package Praktikum7;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135",2000, 5, 23, 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 2000, 5, 11, 16.75, 40);
        Commission commissionEmployee = new Commission("Keanu", "145", 2000, 5, 06, 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 2000, 8, 13, 5000, .04, 300);

        ProductionEmployee productionEmployee1 = new ProductionEmployee("Audirga", "456", 1999, 4, 12, 100, 50);
        ProductionEmployee productionEmployee2 = new ProductionEmployee("Theala", "987", 2000, 5, 13, 300, 40);
        ProductionEmployee productionEmployee3 = new ProductionEmployee("Laksa", "013", 2001, 12, 02, 150, 20);
        ProductionEmployee productionEmployee4 = new ProductionEmployee("Mega", "777", 2002, 8, 05, 350, 20);
        
        System.out.println("Employees diproses secara terpisah:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned: ", basePlusCommissionEmployee.earnings());
        
        Employee[] employees = new Employee[8];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = productionEmployee1;
        employees[5] = productionEmployee2;
        employees[6] = productionEmployee3;
        employees[7] = productionEmployee4;
        
        System.out.println("Employees diproses secara polimorfisme:\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf( "Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary());
            }
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }
    }
}
