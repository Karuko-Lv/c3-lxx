package Task9;

/**
 * @author LXX
 * @date 2021/2/8-22:23
 */
public class Sun extends Star implements Universe{
    @Override
    public void doAnything() {
        System.out.println("sun:太阳吸引着9大行星旋转");
        System.out.println("sun:光照八分钟，到达地球");
    }
}
