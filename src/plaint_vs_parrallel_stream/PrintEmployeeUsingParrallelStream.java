package plaint_vs_parrallel_stream;

import java.util.List;

public class PrintEmployeeUsingParrallelStream {

    public static void main(String[] args) {

        long start = 0;
        long end = 0;

        List<Employee> employees = EmployeeDatabase.getAllEmployee();

        // Get Normal Stream Execution time ..............................
        start = System.currentTimeMillis();
        double averageSalary = employees.stream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Normal Stream Execution time : " + (end - start) + " value : " + averageSalary);


        // Get Parrallel Stream Execution time ..............................
        start = System.currentTimeMillis();
        double averageSalaryParallel = employees.stream().parallel().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Parrallel Stream Execution time : " + (end - start) + " value : " + averageSalaryParallel);


        /// print all employees using parrallel stream.............................
        employees.stream().parallel().forEach(employee -> {
            System.out.println("Thread name : " + Thread.currentThread().getName() + " :  " + "value " + employee.getName());
        });

    }
}
