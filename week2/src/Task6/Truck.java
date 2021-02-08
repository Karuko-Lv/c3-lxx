package Task6;

/**
 * @author LXX
 * @date 2021/2/8-21:34
 */
public class Truck extends Vehicle{
    private int loader;//载人数
    private int payload;//载重量

    public Truck(int wheels, int weight) {
        super(wheels, weight);
    }

    public Truck(int wheels, int weight, int loader, int payload) {
        super(wheels, weight);
        this.loader = loader;
        this.payload = payload;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public  void print(){//不能加static！！！
        System.out.println("车轮的个数是：" + super.getWheels() + "  车重：" + super.getWeight());
        if (loader > 3) {
            System.out.println("这是一辆卡车，能载3人，实载" + loader +"人，你超员了！！！");
        }else {
            System.out.println("这是一辆卡车，能载5人，实载" + loader +"人");
        }
        if (payload > 5000) {
            System.out.println("这是一辆卡车，核载5000kg，你已装载" + payload +"kg，你超载了！！！");
        }else {
            System.out.println("这是一辆卡车，核载5000kg，你已装载" + payload +"kg");
        }
    }
}
