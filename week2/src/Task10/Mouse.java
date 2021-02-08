package Task10;

/**
 * @author LXX
 * @date 2021/2/8-22:40
 */
public class Mouse implements USB{

    @Override
    public void turnOn() {
        System.out.println("鼠标启动了");
    }

    @Override
    public void turnOff() {
        System.out.println("鼠标关闭了");
    }
}
