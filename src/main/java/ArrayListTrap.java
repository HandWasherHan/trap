import java.util.ArrayList;
import java.util.List;

/**
 * @author han <handwasherhan@gmail.com>
 * Created on 2023
 */
public class ArrayListTrap {
    void fun() {
        List<Integer> list = new ArrayList<>(3);
        System.out.println(list.size());
        list.set(3, 1);
        System.out.println(list.get(0));
    }
}
