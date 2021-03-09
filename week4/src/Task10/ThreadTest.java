package Task10;

/**
 * 分析问题 指定
 * @author LXX
 * @date 2021/3/5-16:45
 */
public class ThreadTest {
    public static void main(String[] args) {
        PrintEven printEven = new PrintEven();
        PrintOdd printOdd = new PrintOdd();
        printEven.setName("线程A打印");
        printOdd.setName("线程B打印");
        printEven.start();
        printOdd.start();
    }
}
