package Task2;

/**
 * @author LXX
 * @date 2021/2/22-20:23
 */
public class Manager {
    int Id;
    String Name;
    double Salary;
    int ManagerId;

    public Manager(int id, String name, double salary, int managerId) {
        Id = id;
        Name = name;
        Salary = salary;
        ManagerId = managerId;
    }

    public Manager(int id, String name, double salary) {
        Id = id;
        Name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "|  " + Id + "\t|  " + Name + "\t|  " + Salary + "  |\t" + ManagerId + "\t|  " + "  \n";//这里有新知识的学习！！！
        //TODO:新知识的学习
    }
}
