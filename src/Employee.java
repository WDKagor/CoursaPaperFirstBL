public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private String department;
    private int salary;
    private int id;
    public static int count = 0;

    public Employee(String lastName, String firstName, String middleName, String department, int salary) {
        this.id = ++count;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment() {
        this.department = department;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public String toString() {
        return this.id + ". Ф.И.О. работника: " + this.lastName + " " + this.firstName + " " + this.middleName + ". Отдел: " + this.department + ". Зарплата: " + this.salary + " руб.";
    }
}
