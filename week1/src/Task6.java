import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/1/23-21:13
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请设置账户名称:");
        String name = in.nextLine();
        System.out.println(name+"的账户余额为:");
        double balance = in.nextDouble();
        BankingAccount account = new BankingAccount(name,balance);
        System.out.println(account.getName()+"的余额为"+account.getBalance()+"元");
    }
}
class BankingAccount{
    private String name;
    private Double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public BankingAccount(String name, Double balance) {
        this.name = name;
        this.balance = balance;
    }
}
