package plaint_vs_parrallel_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDatabase {

    public static List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for(int i = 0; i<=1000; i++){
            list.add(new Employee(i, "Employee", Double.valueOf(new Random().nextInt(1000*100))));
        }
        return list;
    }
}
