package Task9;

/**
 * @author LXX
 * @date 2021/2/8-9:33
 */
public class Task9 {
    public static void main(String[] args) {
        Star s = new Sun();
        s.shine();
        System.out.println("======================");
        ((Sun)s).doAnything();//在s前加一个（Sun)--->向下转型

    }
}
