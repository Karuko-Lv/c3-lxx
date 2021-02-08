package Task6;

import java.util.Scanner;

/**
 * @author LXX
 * @date 2021/2/8-9:33
 */
public class Task6 {
    public static void main(String[] args) {

        Car car = new Car(4,1500,3);
        Truck truck = new Truck(6,1500,1,7000);
        car.print();
        System.out.println("-------------------------------");
        truck.print();

    }
}
