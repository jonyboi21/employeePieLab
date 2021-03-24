public class Employee extends Person implements Comparable<Employee>{

private HireDate date;


    public Employee(String name, HireDate date) {
        super(name);
        this.date = date;
    }

    public HireDate getDate() {
        return date;
    }

    public void setDate(HireDate date) {
        this.date = date;
    }
    public void  printBadge(){
        System.out.println("Name: " + getName());

    }
    public int compareTo(Employee other){
        return calculatePay() - other.calculatePay();
    }
}

