import java.util.ArrayList;

public class CheckCashingPlace {

    public static void main(String[] args) {
        Employee salariedEmployee = new SalariedEmployee("Sally", new HireDate("2", "30","2020"), 10000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Harry", new HireDate("3", "19","1999"), 40, 10);
        Enrepreneur enrepreneur = new Enrepreneur("Jordan", 20000);
        HumanResources humanResources = new HumanResources();

        Person [] people  = new Person[10];
        ArrayList<IPayable>unsortedPeople = new ArrayList<>();
        unsortedPeople.add(salariedEmployee);
        unsortedPeople.add(hourlyEmployee);
        unsortedPeople.add(enrepreneur);
        humanResources.sortByIncome(unsortedPeople);
}

}