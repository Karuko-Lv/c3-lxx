package Task10;

/**
 * @author LXX
 * @date 2021/2/8-9:33
 */
public class Task10 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.add(new Mouse());
        computer.add(new KeyBoard());
        computer.add(new Microphone());
        computer.powerOn();
        System.out.println("---------------------------");
        computer.powerOff();
    }
}
