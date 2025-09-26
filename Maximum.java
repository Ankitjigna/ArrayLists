import java.util.*;

public class Maximum {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);
        // int list = sc.
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int max = Integer.MIN_VALUE;
        // System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            // if(max < list.get(i)){
            // max = list.get(i);
            // }

            max = Math.max(max, list.get(i));
        }
        System.out.println(max);

    }
}