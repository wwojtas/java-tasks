package Kolekcje.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {

        HashMap<String, Employee> map = new HashMap<>();
        map.put("Adam", new Employee("Adamski"));
        map.put("Kasia", new Employee("Kasiowska"));
        map.put("Tom", new Employee("Tomowski"));

        Employee e = map.get("Kasia");
        System.out.println(e);

        Iterator i = map.entrySet().iterator();

        while(i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            String key = (String) entry.getKey();
            Employee employee = (Employee)entry.getValue();


            System.out.println(key + " - " + employee);
            System.out.println(key + " - " + employee.getName());
        }

        for (Map.Entry<String, Employee> entry:
        map.entrySet()){
            String key = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println(key + " " + employee);
        }

    }
}
