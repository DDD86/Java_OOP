package Collection;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("SSA");
        array.add("DDD86");
        array.add("Kyle");
        System.out.println(array.size());
        System.out.println(array);

        ArrayList<String> array2 = new ArrayList<>();
        array2 = array;
        array2.add("2D");
        System.out.println(array);
    }
}
