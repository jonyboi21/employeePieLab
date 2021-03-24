public class SalariedEmployee extends Employee{
 private int salary;

    public SalariedEmployee(String name, HireDate date, int salary) {
        super(name, date);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int calculatePay(){
        return salary;
    }

    @Override
    public void printBadge() {
        super.printBadge();
        System.out.println("Type of employee: SalariedEmployee");
        System.out.println("HireDate: " + getDate());
    }
}
