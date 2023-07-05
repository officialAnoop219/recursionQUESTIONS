public class searchbyrecu {
    public static void main(String[] args) {
        int[] arr ={3,2,1,18,9};
        System.out.println(itemsearch(arr,18,0));
        System.out.println(itemsearchindex(arr,18,0));

    }
    static boolean itemsearch(int[] arr, int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || itemsearch(arr,target,index+1);
    }
    static int itemsearchindex(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if (arr[index]==target ){
            return index;
        }else {

        return itemsearchindex(arr,target,index+1);
    }}
}
