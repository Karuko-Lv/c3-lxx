package Task6;

/**
 * @author LXX
 * @date 2021/2/8-21:31
 */
public class Vehicle {
    private int wheels;//车轮个数
    private int weight;//车重

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Vehicle(int wheels, int weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
