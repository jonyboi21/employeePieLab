import java.util.ArrayList;

public class HumanResources {
    public void issueBadge(Employee[] workers){

    }
    public void printPaymentInfo(IPayable person){
        System.out.println(person.getClass().getSimpleName() + " should be paid: " + person.calculatePay());
    }
    public void payPerson(IPayable[] people){
        for (int i = 0; i<people.length; i++){
            printPaymentInfo(people[i]);
        }
    }
    public void sortByIncome(ArrayList<IPayable> list){
        System.out.println("After sorting people by pay...");
        for (int i= 0; i< list.size(); i++){
            printPaymentInfo(list.get(i));
        }
    }

}
