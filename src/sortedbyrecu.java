public class sortedbyrecu {
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        System.out.println(sort(arr,0));

    }
    static boolean sort(int[]arr, int index){
        //base condition
        if(index==arr.length-1){
                return true;
        }
        return arr[index]<arr[index+1] && sort(arr, index+1);
    }
}
