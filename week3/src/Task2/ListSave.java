package Task2;

import java.util.LinkedList;
import java.util.List;

/**
 * @author LXX
 * @date 2021/2/22-20:12
 */
public class ListSave {
    public static void main(String[] args) {
        Manager manager1 = new Manager(1,"Joe",70000,3);
        Manager manager2 = new Manager(2,"Henry",80000,4);
        Manager manager3 = new Manager(3,"Sam",60000);
        Manager manager4 = new Manager(4,"Max",90000);

        List<Manager> lists = new LinkedList<>();
        lists.add(manager1);
        lists.add(manager2);
        lists.add(manager3);
        lists.add(manager4);
        System.out.println("+---+-------+--------+-----------+");
        System.out.println("|Id | Name  | Salary | ManagerId |");
        System.out.println("+---+-------+--------+-----------+");
        for (Manager l : lists) {
            System.out.println(l);
        }
        System.out.println("+---+-------+--------+-----------+");
    }
}
