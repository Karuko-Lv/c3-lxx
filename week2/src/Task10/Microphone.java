package Task10;

/**
 * @author LXX
 * @date 2021/2/8-22:41
 */
public class Microphone implements USB{
    @Override
    public void turnOn() {
        System.out.println("麦克风启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("麦克风关闭了");
    }
}
