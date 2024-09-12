import java.util.*;

public class Collection {
    public static void main(String[] args) {
      mar();
      String l = "Hello, How are you";
      String [] l1 = l.split(",?\\s+");
      for(String x: l1){
          System.out.println(x);
      }
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        for(int el: set){
            System.out.println(el);
        }
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("abc");
        set2.add("def");
        set2.add("abc");
        for(String el: set2){
            System.out.println(el);
        }
        System.out.println(set2.contains("abc"));

    }
    public static void mar(){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i <= 20; i++){
            Random el = new Random();
            Integer n = el.nextInt(20);
            nums.add(n);
        }
        nums.sort(Comparator.reverseOrder());
        System.out.println(nums);
    }
}
