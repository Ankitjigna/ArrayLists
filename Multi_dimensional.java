import java.util.*;

public class Multi_dimensional {
    public static void main(String args[]) {
        // ArrayList<ArrayList<> mainList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();


        list.add(1);
        list.add(2);
        list2.add(3);
        list2.add(4);
        mainList.add(list);
        mainList.add(list2);

        System.out.println(list);
        System.out.println(mainList);

        // for (int i = 0; i < mainList.size(); i++) {
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j = 0; j < currList.size(); j++) {
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();

        // }

        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1); // 1,2,3,4,5
        mainList.add(list2); // 2,4,6,8,10
        mainList.add(list3); // 3,6,9,12,15

        System.out.println(mainList);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
    
