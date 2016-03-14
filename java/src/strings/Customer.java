package strings;

/**
 * Created by rakesh.barik on 10-03-2016.
 */
public class Customer {
    private String name;
    private Integer rollNo;

    public Customer(String name,Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (getRollNo() != customer.getRollNo()) return false;
        return getName() != null ? getName().equals(customer.getName()) : customer.getName() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getRollNo();
        return result;
    }
}
