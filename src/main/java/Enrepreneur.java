public class Enrepreneur extends Person{
   //ivar
    private int income;


    public Enrepreneur(String name, int income) {
        super(name);
        this.income = income;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
    public int calculatePay(){
        return income;
    }
}



