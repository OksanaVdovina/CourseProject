public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Abramov Filipp Davidovich", 45000, 1);
        employee[1] = new Employee("Popov Vitalii Fedorovich", 70000, 2);
        employee[2] = new Employee("Dagorov Ivan Maximovich", 110000, 3);
        employee[3] = new Employee("Kalinov Igor Georgievich", 55000, 4);
        employee[4] = new Employee("Tokarev Grigorii Olegovich", 100000, 5);
        employee[5] = new Employee("Duman Oleg Ivanovich", 120000, 5);
        employee[6] = new Employee("Tulupov Nikolai Romanovich", 90000, 2);
        employee[7] = new Employee("Zigalov Andrei Viktorovich", 85000, 4);
        employee[8] = new Employee("Gureev Anton Olegovich", 130000, 3);
        employee[9] = new Employee("Filippov Daniil Antonovich", 200000, 1);

        countMinSalary(employee);
        countMaxSalary(employee);
        typeAllEmployees(employee);
        countMonthSalaries(employee);
        countAverageSalary(employee);
        nameAllStaff(employee);


    }

    public static void countMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        Employee emp = employees[0];
        for (Employee employee: employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                emp = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: ФИО: " + emp.getName() + " с зарплатой " + minSalary);
    }

    public static void countMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        Employee emp = employees[0];
        for (Employee employee: employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                emp = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: ФИО: " + emp.getName() + " с зарплатой " + maxSalary);
    }

    public static void typeAllEmployees(Employee[] employees) {
        for (Employee employee: employees) {
            System.out.println(employee.toString());
        }
    }

    public static void countMonthSalaries(Employee[] employees) {
        int sum = 0;
        for (Employee employee: employees) {
            sum = sum + employee.getSalary();
        }
        System.out.println("Сумма трат на зарплаты за месяц составила " + sum + " рублей.");
    }

    public static void countAverageSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee: employees) {
            sum = sum + employee.getSalary();
        }
        int averageSum = sum/ employees.length;
        System.out.println("Средняя зарплата за месяц составила " + averageSum + " рублей.");
    }

    public static void nameAllStaff(Employee[] employees) {
        for (Employee employee: employees) {
            System.out.println(employee.getName());
        }
    }

}