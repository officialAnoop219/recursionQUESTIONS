public class reversenum {
    public static void main(String[] args) {
        System.out.println(rev2(1234));

    }
    static int sum =0;
    static void rev1(int n){
        if(n==0){
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);

    }
    static int rev2(int n){
        //sometimes we need  additional variable in the argument ,
        // in that case make an helper function i.e, another function
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }
    private static int helper(int n, int digit){
        if(n%10==n){
            return  n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10, digit-1)) + helper(n/10,digit-1);
    }
}
