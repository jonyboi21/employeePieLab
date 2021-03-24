abstract public class Person implements IPayable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;


    }

    @Override
    public int calculatePay() {
        return 0;
    }
}
