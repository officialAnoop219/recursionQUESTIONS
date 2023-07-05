public class countzero {
    public static void main(String[] args) {
        int c=countzero(30204);
        System.out.println(c);



    }
    static int countzero(int n) {
        return helper(n, 0);
    }
    private static int helper(int n, int count){
        if (n == 0) {
            return count;
        }
        int rem=n%10;
        if (rem==0){
           return helper(n / 10, count + 1);

        } else
          return helper(n / 10, count);
}
}