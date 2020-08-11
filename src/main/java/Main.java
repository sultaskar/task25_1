import javafx.collections.transformation.SortedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, String> employees = new HashMap<String, String>();
        employees.put("Вася","Иванов");
        employees.put("Петр","Петров");
        employees.put("Виткор","Сидоров");
        employees.put("Сергей","Савельев");
        employees.put("Вадим","Викторов");
        employees.put("Антон","Иванов");

        System.out.println(isUnique(employees));




    }

    public static boolean isUnique(Map<String, String> map) {
        Set<String> set = new HashSet<String>(map.values());
        return map.values().size() == set.size();
    }
}
