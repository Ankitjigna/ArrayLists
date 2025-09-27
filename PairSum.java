import java.util.*;
public class PairSum{

    // // Brute force O(n^2)


    public static boolean pairSum1(ArrayList<Integer> list ,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    
    // // 2Pointer approach O(n)


    public static boolean pairSum1(ArrayList<Integer> list ,int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true ;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        int target = 5;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        System.out.println(pairSum1(list ,target));
    }


    
// Pair Sum 2


    // Brute force O(n^2)


    public static boolean pairSum2(ArrayList<Integer> list ,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    
    // 2Pointer approach O(n)


    public static boolean pairSum2(ArrayList<Integer> list ,int target){
        int n = 6;
//breaking point

        int bp = -1;
        for (int i =0;i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1 ;
        int rp = bp ;
        while(lp != rp){
            if(list.get(lp) + list.get(rp) == target){
                return true ;
            }
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % n;
            }else{
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }
    

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        int target = 26;
// sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        // Collections.sort(list);
        System.out.println(pairSum2(list ,target));
    }




    
}