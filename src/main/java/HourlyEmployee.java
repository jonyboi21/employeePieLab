public class HourlyEmployee extends Employee {


    public HourlyEmployee(String name, HireDate date, int hourlyRate, int hoursWorked) {
        super(name, date);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    private int hourlyRate;
    private int hoursWorked;

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int calculatePay() {
        return hoursWorked * hourlyRate;
    }
}