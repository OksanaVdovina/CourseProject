import java.util.Objects;

public class Employee {
    private final String fullName;
    private int salary;
    private int department;
    private static int counter;
    private int id;

    public Employee(String fullName, int salary, int department){
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.id = 1 + counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника: " + fullName + ", Зарплата сотрудника " + salary + ", Отдел: " + department + ", Идентификационный номер сотрудника: " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salary, department, id);
    }
}
