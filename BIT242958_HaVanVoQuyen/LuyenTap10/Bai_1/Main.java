package Bai_1;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");
        String name102 = employees.get(102);
        System.out.println("ten nhan vien co id 102 :  " + name102);
        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
            System.out.println("da them nhan vien 105 vi chua ton tai.");
        }
                System.out.println("danh sach nhan vien hien tai " + employees);
    }
}