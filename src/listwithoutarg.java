import java.util.AbstractList;
import java.util.ArrayList;

public class listwithoutarg {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,8};
        System.out.println(findIndex(arr,4,0));

    }
    static ArrayList<Integer> findIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this is ans from that call fxn only
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls = findIndex(arr, target,index+1);
        list.addAll(ansfrombelowcalls);
        return list;
    }
}
