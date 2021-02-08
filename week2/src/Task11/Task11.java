package Task11;

import java.util.LinkedList;

/**
 * @author LXX
 * @date 2021/2/8-22:54
 */
public class Task11 {
    public static void main(String[] args) {

        PetShop shop = new PetShop();
        shop.add(new Cat("波斯猫",3));
        shop.add(new Cat("波斯猫2",5));
        shop.add(new Cat("波斯猫3",6));
        shop.add(new Dog("松狮",2));
        shop.add(new Dog("松狮2",4));

        shop.delete(new Cat("波斯猫3",6));

        LinkedList<Pet> all = shop.search("波");//
        Object[] obj = all.toArray();

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}
