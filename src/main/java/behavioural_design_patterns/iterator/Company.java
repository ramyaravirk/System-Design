package behavioural_design_patterns.iterator;

import java.util.List;

public class Company implements Aggregrate<Employee>{
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(employees);
    }
}
