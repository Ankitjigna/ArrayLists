
import java.util.*;

public class Operations {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        // list.add(1,11);
        // System.out.println(list);

        // Get
        int element = list.get(4);
        System.out.println(element);

        //contains
        System.out.println(list.contains(2));

        //remove
        System.out.println(list.remove(2));

        //set
        System.out.println(list.set(2,10));


        // size of Arraylist
        System.out.println(list.size());

        //prin the arraylist

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        // Reverse of an arraylist
        for(int i = list.size() -1 ; i>=0 ; i--) {
            System.out.println(list.get(i));
        }

    }
}
