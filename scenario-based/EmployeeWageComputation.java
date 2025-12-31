package scenario_Based;

import java.util.*;

abstract class Employee {

    int id;
    String name;
    String dept;

    static final int RATE = 20;
    static final int FULL_HOURS = 8;
    static final int PART_HOURS = 4;
    static final int MAX_DAYS = 20;
    static final int MAX_HOURS = 100;

    Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    int getAttendance() {
        return new Random().nextInt(3); // 0-Absent,1-Full,2-Part
    }

    abstract int getSalary();

    void showDetails() {
        System.out.println("ID        : " + id);
        System.out.println("Name      : " + name);
        System.out.println("Department: " + dept);
        System.out.println("Salary    : ₹" + getSalary());
        System.out.println();
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee {

    FullTimeEmployee(int id, String name, String dept) {
        super(id, name, dept);
    }

    public int getSalary() {

        int hours = 0, days = 0, salary = 0;

        while (hours < MAX_HOURS && days < MAX_DAYS) {

            if (getAttendance() == 1) {
                hours += FULL_HOURS;
                salary += FULL_HOURS * RATE;
            }
            days++;
        }
        return salary;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {

    PartTimeEmployee(int id, String name, String dept) {
        super(id, name, dept);
    }

    public int getSalary() {

        int hours = 0, days = 0, salary = 0;

        while (hours < MAX_HOURS && days < MAX_DAYS) {

            int attend = getAttendance();

            if (attend == 1) {
                hours += FULL_HOURS;
                salary += FULL_HOURS * RATE;
            } else if (attend == 2) {
                hours += PART_HOURS;
                salary += PART_HOURS * RATE;
            }
            days++;
        }
        return salary;
    }
}

public class EmployeeWageComputation {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee(501, "Amit", "Hiring"));
        list.add(new PartTimeEmployee(502,"nishant", "Technical"));

        for (Employee e : list) {
            e.showDetails();
        }
    }
}
