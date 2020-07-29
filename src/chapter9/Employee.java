package chapter9;

public class Employee extends Person {

    private String employeeid;
    private String title;

    public Employee(){
        super("angie");
        System.out.println("Default constructor Employee");
    }

    public Employee(String name, int age, String gender, String employeeid, String title) {
        super(name, age, gender);
        this.employeeid = employeeid;
        this.title = title;
    }

    public Employee(String name, String employeeid, String title) {
        super(name);
        this.employeeid = employeeid;
        this.title = title;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
