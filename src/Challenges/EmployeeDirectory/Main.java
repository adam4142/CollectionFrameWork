package Challenges.EmployeeDirectory;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        HashMap<Integer, String> employeeDirectory = new HashMap<>();

        employeeDirectory.put(101, "Adam");
        employeeDirectory.put(102, "Eve");
        employeeDirectory.put(103, "Kevin");
        employeeDirectory.put(105, "Alan");
        employeeDirectory.put(106, "Dev");
        employeeDirectory.put(1018, "Adam");
        employeeDirectory.put(1028, "Eve");


        System.out.println(employeeDirectory.get(101));

        System.out.println(employeeDirectory.containsKey(104));
    }
}